package com.xiongdada.controller;

import java.util.Objects;

/**
 * auth : xiongdada
 * date : 2024/6/5
 **/
public class Preson {
    public String name;
    public int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Preson preson = (Preson) o;
        return age == preson.age && Objects.equals(name, preson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Preson() {
    }

    public Preson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
