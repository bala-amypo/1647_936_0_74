package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annoatation.RestController;

import com.springframework.demo.service.StudentService;

@RestController
public class StudentController
{
    @Autowired StudentService ser;
}