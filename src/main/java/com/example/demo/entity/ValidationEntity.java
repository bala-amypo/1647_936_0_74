package com.example.demo.entity;
import jakarat.persistence.Entity;
import jakarat.persistence.Id;
import jakarat.persistence.GeneratedValue;
import jakarat.persistence.GenetationType;
import jakarat.persistence.NotNull;
import jakarat.persistence.Size;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(stratergy=GenerationType.IDENTITY)
    private Long id;
    private Integer age;
    @NotNull
    private String email;
    private String password;
    private String username;
}