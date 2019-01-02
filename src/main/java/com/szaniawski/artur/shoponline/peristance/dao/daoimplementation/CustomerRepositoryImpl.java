package com.szaniawski.artur.shoponline.peristance.dao.daoimplementation;

import com.szaniawski.artur.shoponline.domain.entities.CustomerEntity;
import com.szaniawski.artur.shoponline.domain.entities.TransactionEntity;
import com.szaniawski.artur.shoponline.peristance.dao.CustomizedCustomerRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomizedCustomerRepository {



    @Override
    public CustomerEntity assignTransaction(CustomerEntity customerEntity, TransactionEntity transactionEntity) {
        return null;
    }

    @Override
    public List<CustomerEntity> findTopThreeClientsWhoSpentTheMostInPeriod(Date dateFrom, Date dateTo, int amountOfClients) {
        return null;
    }

    @Override
    public int getNumberOfTransationsForCustomer(Long clientId) {
        return 0;
    }
}
