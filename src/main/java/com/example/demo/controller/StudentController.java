package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annoatation.RequestBody;
import org.springframework.web.bind.annoatation.RestController;
import org.springframework.web.bind.annoatation.postMaping;


import com.example.demo.service.StudentService;
import com.springframework.demo.service.StudentService;

@RestController
public class StudentController
{
    @Autowired StudentService ser;
    @postMaping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu)
    {
        return ser.postData(stu);
    }
}