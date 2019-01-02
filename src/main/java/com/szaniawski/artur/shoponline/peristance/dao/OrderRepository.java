package com.szaniawski.artur.shoponline.peristance.dao;

import com.szaniawski.artur.shoponline.domain.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>, CustomizedOrderRepository {




    List<OrderEntity> findByAmount(Integer amount);



    OrderEntity findByAmount(Long amount);
}
