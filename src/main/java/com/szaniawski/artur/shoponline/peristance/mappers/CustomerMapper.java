package com.szaniawski.artur.shoponline.peristance.mappers;

import com.szaniawski.artur.shoponline.domain.entities.CustomerEntity;
import com.szaniawski.artur.shoponline.domain.entities.TransactionEntity;
import com.szaniawski.artur.shoponline.domain.types.CustomerTO;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerMapper {

   /* @PersistenceContext
    private EntityManager entityManager;*/

    public CustomerTO toCustomerTO(CustomerEntity customerEntity) {

        if (customerEntity == null) {
            return null;
        }
        CustomerTO.CustomerTOBuilder customerTOBuilder = new CustomerTO.CustomerTOBuilder().withVersion(customerEntity.getVersion())
                .withId(customerEntity.getId()).withFirstName(customerEntity.getFirstName())
                .withAdressData(AdressMapper.toAdressDataTO((customerEntity.getAdressData())))
                .withLastName(customerEntity.getLastName()).withDateOfBirth(customerEntity.getDateOfBirth())
                .withMail(customerEntity.getMail()).withMobile(customerEntity.getMobile());

        /*if (customerEntity.getTransactions() != null) {
            customerTOBuilder.withTransactions(
                    customerEntity.getTransactions().stream().map(e -> e.getId()).collect(Collectors.toList()));

        }*/
        return customerTOBuilder.build();
    }

    public CustomerEntity toCustomerEntity(CustomerTO customerTO) {
        if (customerTO == null)
            return null;

      /*  List<Long> transactions = customerTO.getTransactions();
        List<TransactionEntity> listOfTransactions = new ArrayList<>();
        if (transactions != null) {
            for (Long id : transactions) {
                listOfTransactions.add(entityManager.getReference(TransactionEntity.class, id));
            }
        }*/

        CustomerEntity.CustomerEntityBuilder customerEntityBuilder = new CustomerEntity.CustomerEntityBuilder().withVersion(customerTO.getVersion())
                .withId(customerTO.getId()).withFirstName(customerTO.getFirstName())
                .withAdressData(AdressMapper.toAdressDataEntity(customerTO.getAdressData()))
                .withLastName(customerTO.getLastName()).withDateOfBirth(customerTO.getDateOfBirth())
                .withMail(customerTO.getMail()).withMobile(customerTO.getMobile());

        return customerEntityBuilder.build();

    }

    public List<CustomerTO> map2TOs(List<CustomerEntity> carEntities) {
        return carEntities.stream().map(this::toCustomerTO).collect(Collectors.toList());
    }

    public List<CustomerEntity> map2Entities(List<CustomerTO> customerTOs) {
        return customerTOs.stream().map(this::toCustomerEntity).collect(Collectors.toList());
    }
}
