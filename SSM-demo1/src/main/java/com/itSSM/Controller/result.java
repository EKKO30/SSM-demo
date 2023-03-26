package com.itSSM.Controller;

public class result {
    private String msg;
    private Object data;
    private Integer coding;

    public result() {
    }

    public result(Integer coding,Object data) {
        this.data = data;
        this.coding = coding;
    }

    public result(Integer coding, String msg, Object data) {
        this.msg = msg;
        this.data = data;
        this.coding = coding;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCoding() {
        return coding;
    }

    public void setCoding(Integer coding) {
        this.coding = coding;
    }
}
