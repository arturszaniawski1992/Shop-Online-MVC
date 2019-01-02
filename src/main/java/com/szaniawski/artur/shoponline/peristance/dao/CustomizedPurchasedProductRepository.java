package com.szaniawski.artur.shoponline.peristance.dao;

import com.szaniawski.artur.shoponline.domain.entities.PurchasedProductEntity;

import java.util.List;

public interface CustomizedPurchasedProductRepository {

    public List<PurchasedProductEntity> getBestSellingProducts(int amount);

}
