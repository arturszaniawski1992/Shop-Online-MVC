package com.szaniawski.artur.shoponline.peristance.dao.daoimplementation;

import com.querydsl.jpa.impl.JPAQuery;
import com.szaniawski.artur.shoponline.domain.entities.PurchasedProductEntity;
import com.szaniawski.artur.shoponline.peristance.dao.CustomizedPurchasedProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class PurchasedProductRepositoryImpl implements CustomizedPurchasedProductRepository {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<PurchasedProductEntity> getBestSellingProducts(int amount) {
        return null;

    }
}
