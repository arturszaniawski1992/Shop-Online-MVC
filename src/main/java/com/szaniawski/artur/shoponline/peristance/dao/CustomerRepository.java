package com.szaniawski.artur.shoponline.peristance.dao;

import com.szaniawski.artur.shoponline.domain.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>, CustomizedCustomerRepository {



    List<CustomerEntity> findByFirstNameAndLastName(String firstName, String lastName);


    void deleteById(Long id);


    void deleteByLastName(String lastName);

}
