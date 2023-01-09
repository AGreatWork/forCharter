package com.interview.forCharter.entity;

import com.interview.forCharter.repo.TransactionDetailRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransCommandLineRunner implements CommandLineRunner {

    private TransactionDetailRepository repository;

    public TransCommandLineRunner(TransactionDetailRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new TransactionDetail("Jan", 1L, 120.00));
        repository.save(new TransactionDetail("Feb", 1L, 150.12));
        repository.save(new TransactionDetail("Mar", 1L, 70.23));
        repository.save(new TransactionDetail("Jan", 2L, 300.00));
        repository.save(new TransactionDetail("Feb", 2L, 400.50));
        repository.save(new TransactionDetail("Mar", 2L, 500.00));

//        List<TransactionDetail> trans = repository.findByCusIDAndTransMonth(1L, "Jan");
//        trans.forEach(tran -> System.out.println(tran));

    }
}
