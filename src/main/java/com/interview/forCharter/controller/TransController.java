package com.interview.forCharter.controller;

import com.interview.forCharter.entity.TransactionDetail;
import com.interview.forCharter.repo.TransactionDetailRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransController {
    private final TransactionDetailRepository repository;

    public TransController(TransactionDetailRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/points/{cusId}")
    String getPointsForACustomer(@PathVariable Long cusId){
        List<TransactionDetail> trans = repository.findByCusID(cusId);
        Double sum =
                trans.stream().mapToDouble(tran -> calPoints(tran.getSpendingAmount())).sum();


        return sum.toString();

    }

    @GetMapping("/points/{cusId}/{mon}")
    String getPointsForACustomer(@PathVariable Long cusId, @PathVariable String mon){
        List<TransactionDetail> trans = repository.findByCusIDAndTransMonth(cusId, mon);
        Double sum =
                trans.stream().mapToDouble(tran -> calPoints(tran.getSpendingAmount())).sum();

        return sum.toString();

    }

    Double calPoints(Double amount){
        if(amount <=50){
            return 0d;
        }else if(amount <= 100){
            return amount-50;
        }else {
            return 50+2*(amount-100.0);
        }
    }
}
