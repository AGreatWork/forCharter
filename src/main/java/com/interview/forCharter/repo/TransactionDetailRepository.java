package com.interview.forCharter.repo;

import com.interview.forCharter.entity.TransactionDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionDetailRepository extends JpaRepository<TransactionDetail, Long> {
    List<TransactionDetail> findByCusID(Long cusID);
    List<TransactionDetail> findByCusIDAndTransMonth(Long cusID, String m);

}