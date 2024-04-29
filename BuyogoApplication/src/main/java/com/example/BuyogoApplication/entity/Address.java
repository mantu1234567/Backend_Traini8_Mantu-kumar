package com.example.BuyogoApplication.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

  @AllArgsConstructor
  @NoArgsConstructor
  @Getter
  @Setter
  @Entity

   @Table(name = "Address")
   public class Address {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "Detailed Address is required")
    private String detailedAddress;

    @NotNull(message = "City is required")
    private String city;

    @NotNull(message = "State is required")
    private String state;

    @NotNull(message = "Pincode is required")
    private String pincode;

}
