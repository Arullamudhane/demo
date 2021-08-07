package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
public class BillDetails {

    @Id
    private long id;


    @ManyToOne
    @JoinColumn(name = "productDetails_id")
    private ProductDetails productDetails;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    private Long value;

    private Long discountPercentage;

    private Long discountValue;

    private Long finalValue;

    private String couponApplied;

    private String shippingAddress;

    @OneToOne
    @JoinColumn(name= "transactionDetails_id")
    private TransactionDetails transactionDetails;



}
