package com.szaniawski.artur.shoponline.peristance.services;

import com.szaniawski.artur.shoponline.domain.types.CustomerTO;

import java.util.List;

public interface CustomerService {

    public CustomerTO findCustomerById(Long id);
    public List<CustomerTO> findAllCustomers();
    public CustomerTO saveCustomer(CustomerTO customerTO);

}
