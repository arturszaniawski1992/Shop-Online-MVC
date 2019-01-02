package com.szaniawski.artur.shoponline.peristance.services.servicesImpl;

import com.szaniawski.artur.shoponline.domain.types.CustomerTO;
import com.szaniawski.artur.shoponline.peristance.dao.CustomerRepository;
import com.szaniawski.artur.shoponline.peristance.mappers.CustomerMapper;
import com.szaniawski.artur.shoponline.peristance.services.CustomerService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;


    public CustomerServiceImpl( CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerTO findCustomerById(Long id) {
        return null;
        //return customerMapper.toCustomerTO(customerRepository.getOne(id));
    }

    @Override
    public List<CustomerTO> findAllCustomers() {
        return customerMapper.map2TOs(customerRepository.findAll());
    }

    @Override
    public CustomerTO saveCustomer(CustomerTO customerTO) {
        return null;

        //CustomerEntity customerEntity = customerRepository.save(customerMapper.toCustomerEntity(customerTO));
        //return customerMapper.toCustomerTO(customerEntity);
    }
}
