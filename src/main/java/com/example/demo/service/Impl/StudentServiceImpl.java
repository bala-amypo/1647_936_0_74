package com.example.demo.service.Impl;

import org.springframework.sterotype.Service;
import org.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student;
    // save()
    // findAll()
    // findById()
    // deleteById();
    // existsById();
    public StudentEntity postData(StudentEntity stu)
    { 
return studennt.save(stu);
    }
}