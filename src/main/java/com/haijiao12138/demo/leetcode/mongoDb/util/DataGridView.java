package com.haijiao12138.demo.leetcode.mongoDb.util;


public class DataGridView {
    private Integer code=0;
    private String msg="";
    private Long count;
    private Object data;

    public DataGridView() {
    }

    public DataGridView(Object data) {
        super();
        this.data = data;
    }


    public DataGridView(Long count, Object data) {
        super();
        this.count = count;
        this.data = data;
    }
    public DataGridView(int  code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }
    public DataGridView(Long count, Object data,String msg) {
        super();
        this.msg=msg;
        this.count = count;
        this.data = data;
    }
    public DataGridView(int code,Long count, Object data,String msg) {
        super();
        this.msg=msg;
        this.code=code;
        this.count = count;
        this.data = data;
    }

    public DataGridView(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
