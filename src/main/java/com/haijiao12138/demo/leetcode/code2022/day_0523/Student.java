package com.haijiao12138.demo.leetcode.code2022.day_0523;

import java.util.*;

/**
 * @Author:候苑博
 * @Date:2022-05-23 11:45
 * description:
 * Todo:
 */
public class Student {
    private String name;
    private String sex;
    private String age;
    private float weight;
    private String addr;

    //重写hashcode


    @Override
    public int hashCode() {
        int result = name.hashCode();
        result  = 17*result + sex.hashCode();
        result = 17*result + age.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)){
            return  false;//==null的情况
        }
        Student stuObj = (Student) obj;
        if (this == stuObj){
            return  true;
        }
        //如果两个对象 姓名  年龄 性别相等  我们认为这两个对象相等
        if (stuObj.name.equals(this.name) && stuObj.equals(this.sex) && stuObj.equals(this.age)){
            return true;
        }else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAddr("1111");
        s1.setAge("20");
        s1.setName("allan");
        s1.setSex("male");
        s1.setWeight(60f);

        Student s2 =new Student();
        s2.setAddr("222");
        s2.setAge("20");
        s2.setName("allan");
        s2.setSex("male");
        s2.setWeight(70f);

        if(s1.equals(s2)) {
            System.out.println("s1==s2");
        }else {
            System.out.println("s1 != s2");
        }

        Set set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());

        Map m = new HashMap();
        m.put(s1, s1);
        m.put(s2, s2);
        System.out.println(m);


    }
}
