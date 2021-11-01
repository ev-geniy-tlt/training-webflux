package com.example.webflux.model;

public class StudentDto {
    private String name;
    private Integer mark;

    public StudentDto() {
    }

    public StudentDto(String name, Integer mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}
