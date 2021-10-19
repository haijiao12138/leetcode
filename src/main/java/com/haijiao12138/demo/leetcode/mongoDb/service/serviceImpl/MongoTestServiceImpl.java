    package com.haijiao12138.demo.leetcode.mongoDb.service.serviceImpl;


    import com.haijiao12138.demo.leetcode.mongoDb.entity.MongoTest;
    import com.haijiao12138.demo.leetcode.mongoDb.service.MongoTestService;
    import com.mongodb.client.result.DeleteResult;
    import com.mongodb.client.result.UpdateResult;
    import lombok.extern.slf4j.Slf4j;
    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Slf4j
@Service("MongoTestService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MongoTestServiceImpl implements MongoTestService {

@Autowired
private MongoTemplate mongoTemplate;

    /**
     * 创建对象 -插入数据
     * @param mgtest
     */
    @Override
    public MongoTest saveTest(MongoTest mgtest) {
        MongoTest save = mongoTemplate.save(mgtest);
        return save;
    }

     //分页查找数据
    @Override
    public List<MongoTest> findTestByName(Integer currentPage,  Integer pageSize,MongoTest mgtest) {
        Query query = null;
        if (!mgtest.getName().isEmpty()){
            query= new Query(Criteria.where("name").is(mgtest.getName()));
        }
        if (mgtest.getIds() != null){
            query= new Query(Criteria.where("ids").is(mgtest.getIds()));
        }
        if (mgtest.getAge() !=null){
            query= new Query(Criteria.where("age").is(mgtest.getAge()));
        }
        // 每页五个
        //Example<MongoTest> example = Example.of(mgtest);
        PageRequest pageable = PageRequest.of(currentPage-1,pageSize);
        Query with = query.with(pageable);

        List<MongoTest> list = mongoTemplate.find(with, MongoTest.class);

        return list;
    }

    //更新数据
    @Override
    public long updateTest(MongoTest mgTest) {
        Query query = new Query(Criteria.where("ids").is(mgTest.getIds()));
        Update set = new Update().set("age", mgTest.getAge()).set("name", mgTest.getName());
        UpdateResult updateResult = mongoTemplate.updateFirst(query, set, MongoTest.class);//只更新查询返回结果集的第一条
        System.out.println("==================");
        System.out.println(updateResult);
        //mongoTemplate.updateMulti(query,set,MongoTest.class);//更新查询返回结果集的所有
        return updateResult.getMatchedCount();//更新的条数
    }

   //删除
    @Override
    public long deleteTestById(int ids) {
        Query query = new Query(Criteria.where("ids").is(ids));
        DeleteResult remove = mongoTemplate.remove(query, MongoTest.class);

        return  remove.getDeletedCount();
    }


}
