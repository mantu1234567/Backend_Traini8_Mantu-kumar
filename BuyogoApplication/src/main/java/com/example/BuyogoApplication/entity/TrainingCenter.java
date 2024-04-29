package com.example.BuyogoApplication.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

   @AllArgsConstructor
   @NoArgsConstructor
   @Data
   @Entity
   @Table(name = "TrainingCenter")
   public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "CenterName is required")
    @Size(max = 40, message = "CenterName must be less than 40 characters")
    private String centerName;

    @NotBlank(message = "CenterCode is required")
    @Pattern(regexp = "\\w{12}", message = "CenterCode must be exactly 12 alphanumeric characters")
    private String centerCode;

    @NotNull(message = "Student Capacity is required")
    @PositiveOrZero(message = "Student Capacity must be a positive number or zero")
    private Integer studentCapacity;

    @NotNull(message = "ContactPhone is required")
    @Pattern(regexp = "\\d{10,}", message = "Invalid ContactPhone format")
    private String contactPhone;

    @Email(message = "Invalid ContactEmail format")
    private String contactEmail;

     @Temporal(TemporalType.TIMESTAMP)
     @Column(nullable = false)
     private Date LastUpdate;
     @PrePersist
     private void onCreate(){
       LastUpdate = new Date();
       }
     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "addressId")
     private Address address;

     @OneToMany(cascade = CascadeType.ALL)
     @JoinColumn(name = "centreId")
     private List<Course> courses;
}
