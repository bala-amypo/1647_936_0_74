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
    public void setCreated(date created)
    {
        this.created=created;
    }
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getPasswird()
    {
        return password;
    }