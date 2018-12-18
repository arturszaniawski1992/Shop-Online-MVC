package com.szaniawski.artur.shoponline.peristance.mappers;

import com.szaniawski.artur.shoponline.domain.entities.CustomerEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class CustomerMapper {

    @PersistenceContext
    private EntityManager entityManager;

    public CustomerTO toCustomerTO (CustomerEntity customerEntity){
        if()
    }

}
