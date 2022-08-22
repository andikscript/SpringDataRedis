package com.andikscript.springdataredis.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Student")
public class Student {

    private String id;

    private String name;

    private Integer grade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
