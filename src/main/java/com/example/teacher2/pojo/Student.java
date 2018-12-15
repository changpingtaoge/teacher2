package com.example.teacher2.pojo;

import java.util.Date;

/**
 * @作者：matao
 * @时间：2018/12/13 0013 上午 9:16
 * @描述：这是一个实体类studenta
*/
public class Student {
    private String name;
    private Integer age;
    private String pwd;
    private String sex;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
