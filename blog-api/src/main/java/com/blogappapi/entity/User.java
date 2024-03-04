package com.blogappapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



    @Entity
    @Table(name = "users")
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public class User {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private int id;

        @Column(name = "user_name",nullable = false,length = 100)
        private String name;

        @Column(name = "user_email",nullable = false,length = 100)
        private String email;

        @Column(name = "user_password",nullable = false,length = 100)
        private  String password;

        @Column(name = "about",nullable = false,length = 100)
        private  String about;

    }


