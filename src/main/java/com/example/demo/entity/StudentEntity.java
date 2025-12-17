package com.example.demo.entity;


import java.sql.Date; 
@Entity
public class StudentEntity{
    private String name;
    private String id;
    private String email;
    private String created;
    public String getUsername()
    {
        return username;
    }
    public void Setusername(String name)
    {
        this.name=name;
    }
    
}