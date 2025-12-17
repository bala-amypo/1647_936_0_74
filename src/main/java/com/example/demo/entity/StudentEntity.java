package com.example.demo.entity;


import java.sql.Date; 
@Entity
public class StudentEntity{
    private String name;
    private String id;
    private String email;
    private String created;
    public String getCreated()
    {
        return created;
    }
    public void setCreated(date )