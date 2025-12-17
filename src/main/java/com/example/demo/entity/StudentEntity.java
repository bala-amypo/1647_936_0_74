package com.example.demo.entity;


import java.sql.Date; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.Identity)
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
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public SampleEntity(Integer id,String name,String email,String password,Date created)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.created=created;
    }
    public SampleEntity()
    {

    }
