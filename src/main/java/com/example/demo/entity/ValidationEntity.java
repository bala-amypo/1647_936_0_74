package com.example.demo.entity;
import jakarat.persistence.Entity;
import jakarat.persistence.Id;
import jakarat.persistence.GeneratedValue;
import jakarat.persistence.GenetationType;
import jakarat.validation.constraints.NotNull;
import jakarat.validation.constraints.Size;
import jakarat.validation.constraints.Email;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(stratergy=GenerationType.IDENTITY)
    private Long id;
  
    @NotNull
    @Size(min=2,max=10,message="must be 2 to 10 characters")
    private String username;
    @Email(message="Email  is not valid")
    private String email;
    @Max(8)
    @NotNull(message="Password is mandotary")
    private String password;
    @Max(20)
    private Integer age;
    }