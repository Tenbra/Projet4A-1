package com.example.version2.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CreatePayment {

     private String customerId;
     private int prix;

}
