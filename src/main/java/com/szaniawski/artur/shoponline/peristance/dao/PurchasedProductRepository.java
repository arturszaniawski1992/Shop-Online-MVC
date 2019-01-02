package com.szaniawski.artur.shoponline.peristance.dao;

import com.szaniawski.artur.shoponline.domain.entities.PurchasedProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchasedProductRepository extends JpaRepository<PurchasedProductEntity, Long>, CustomizedPurchasedProductRepository {




    List<PurchasedProductEntity> findByProductName(String productName);



    void deleteByProductName(String productName);
}
