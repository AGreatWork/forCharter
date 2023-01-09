package com.interview.forCharter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TransactionDetail {
    @Id
    @GeneratedValue
    private Long transId;
    private String transMonth;
    private Long cusID;
    private Double spendingAmount;

    public TransactionDetail() {
    }

    public TransactionDetail(String transMonth, Long cusID, Double spendingAmount) {
        this.transMonth = transMonth;
        this.cusID = cusID;
        this.spendingAmount = spendingAmount;

    }

    public Long getTransId() {
        return transId;
    }

    public String getTramsMonth() {
        return transMonth;
    }

    public Long getCusID() {
        return cusID;
    }

    public Double getSpendingAmount() {
        return spendingAmount;
    }

    @Override
    public String toString() {
        return "TransactionDetail{" +
                "TransId=" + transId +
                ", TramsMonth='" + transMonth + '\'' +
                ", cusID=" + cusID +
                ", SpendingAmount=" + spendingAmount +
                '}';
    }
}