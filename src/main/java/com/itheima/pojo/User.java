package com.itheima.pojo;

import java.io.Serializable;

/**
 * @Author:LiaoHongYu
 * @Date:2020/8/17,15:07
 */
public class User implements Serializable {

    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
