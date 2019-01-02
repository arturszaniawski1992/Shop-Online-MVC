package com.szaniawski.artur.shoponline.peristance.services;

import com.szaniawski.artur.shoponline.domain.types.PurchasedProductTO;
import com.szaniawski.artur.shoponline.domain.types.PurchasedProductTOWithNameAndAmount;

import java.util.List;

public interface PurchasedProductService {

    public PurchasedProductTO findPurchasedProductById(Long id);

    public List<PurchasedProductTO> findAllPurchasedProducts();


    public PurchasedProductTO updateProduct(PurchasedProductTO purchasedProductTO);


    public PurchasedProductTO savePurchasedProduct(PurchasedProductTO purchasedProductTO);


    void removeProduct(Long id);


    public Long countProducts();


    public List<PurchasedProductTOWithNameAndAmount> findListProductsWithTransactionInProgress();

    public List<PurchasedProductTO> getBestSellingProducts(int amount);
}
