package com.szaniawski.artur.shoponline.peristance.dao;

import com.szaniawski.artur.shoponline.domain.entities.TransactionEntity;
import com.szaniawski.artur.shoponline.domain.enums.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long>, CustomizedTransactionRepository {


    List<TransactionEntity> findByTransactionStatus(TransactionStatus transactionStatus);


    void deleteByTransactionStatus(TransactionStatus transactionStatus);


}
