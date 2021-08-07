package com.example.demo.entity;

import com.example.demo.constants.TransactionStatus;
import com.example.demo.constants.TransactionType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class TransactionDetails {

    @Id
    private Long id;

    private TransactionType transactionType;

    private TransactionStatus transactionStatus;

    private Long totalValue;

}
