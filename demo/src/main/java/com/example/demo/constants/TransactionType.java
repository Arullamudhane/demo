package com.example.demo.constants;

public enum TransactionType {

    CASH_ON_DELIVERY(1),

    DEBIT_CARD(2),

    CREDIT_CARD(3),

    COUPON_CARD(4),

    FREE(5),

    UPI(6);

    private int id;

    TransactionType(int id) {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
