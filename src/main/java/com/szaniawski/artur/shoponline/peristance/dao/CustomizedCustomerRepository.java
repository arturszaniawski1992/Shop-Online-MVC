package com.szaniawski.artur.shoponline.peristance.dao;

import com.szaniawski.artur.shoponline.domain.entities.CustomerEntity;
import com.szaniawski.artur.shoponline.domain.entities.TransactionEntity;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

public interface CustomizedCustomerRepository {

    public CustomerEntity assignTransaction(CustomerEntity customerEntity, TransactionEntity transactionEntity);


    public List<CustomerEntity> findTopThreeClientsWhoSpentTheMostInPeriod(Date dateFrom, Date dateTo,
                                                                           int amountOfClients);

    public int getNumberOfTransationsForCustomer(Long clientId);
}