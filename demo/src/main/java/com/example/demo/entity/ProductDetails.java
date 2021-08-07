package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class ProductDetails {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name= "product_id")
    private Product product;

     private String quality;

     private int value;

     private Integer size;

     //Date Of Manuf
     private LocalDateTime DOM;

     //Expiry
     private LocalDateTime DOE;


}
