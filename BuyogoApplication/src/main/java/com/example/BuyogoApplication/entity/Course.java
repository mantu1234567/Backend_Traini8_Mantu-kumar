package com.example.BuyogoApplication.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

   @AllArgsConstructor
   @NoArgsConstructor
   @Entity
   @Getter
   @Setter

    public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "courseName should null")
    private String courseName;
    }
