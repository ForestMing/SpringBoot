package com.example.demo.entity;
import java.io.Serializable;

/**
 * Created by 69077 on 2017/11/17.
 */
public class Person implements Serializable{
    private int id ;
    private String name ;

    public Person(){}

    public int getId() {return id;}

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
