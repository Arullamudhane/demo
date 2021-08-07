package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter
@Setter
public class PurchaseItems {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "billDetails_id")
    private BillDetails billDetails;

    @ManyToOne
    @JoinColumn(name = "productDetails_id")
    private ProductDetails productDetails;

    private int quality;

    private Long value;

    private Long discountPercentage;

    private Long discountValue;

    private Long finalValue;

    private String Details;


}
