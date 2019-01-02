package com.szaniawski.artur.shoponline.peristance.services.servicesImpl;

import com.szaniawski.artur.shoponline.domain.entities.PurchasedProductEntity;
import com.szaniawski.artur.shoponline.domain.types.PurchasedProductTO;
import com.szaniawski.artur.shoponline.domain.types.PurchasedProductTOWithNameAndAmount;
import com.szaniawski.artur.shoponline.peristance.dao.CustomerRepository;
import com.szaniawski.artur.shoponline.peristance.dao.PurchasedProductRepository;
import com.szaniawski.artur.shoponline.peristance.mappers.PurchasedProductMapper;
import com.szaniawski.artur.shoponline.peristance.services.PurchasedProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PurchasedProductServiceImpl implements PurchasedProductService {

    private final CustomerRepository customerRepository;
    private final PurchasedProductRepository purchasedProductRepository;
    private final PurchasedProductMapper purchasedProductMapper;

    public PurchasedProductServiceImpl(CustomerRepository customerRepository, PurchasedProductRepository purchasedProductRepository, PurchasedProductMapper purchasedProductMapper) {
        this.customerRepository = customerRepository;
        this.purchasedProductRepository = purchasedProductRepository;
        this.purchasedProductMapper = purchasedProductMapper;
    }

    @Override
    public PurchasedProductTO findPurchasedProductById(Long id) {
        return purchasedProductMapper.toPurchasedProductTO(purchasedProductRepository.getOne(id));
    }

    @Override
    public List<PurchasedProductTO> findAllPurchasedProducts() {
        List<PurchasedProductEntity> allProducts = purchasedProductRepository.findAll();
        return purchasedProductMapper.map2TOs(allProducts);
    }

    @Override
    public PurchasedProductTO updateProduct(PurchasedProductTO purchasedProductTO) {
        return null;
    }

    @Override
    public PurchasedProductTO savePurchasedProduct(PurchasedProductTO purchasedProductTO) {
        return null;
    }

    @Override
    public void removeProduct(Long id) {

    }

    @Override
    public Long countProducts() {
        return null;
    }

    @Override
    public List<PurchasedProductTOWithNameAndAmount> findListProductsWithTransactionInProgress() {
        return null;
    }

    @Override
    public List<PurchasedProductTO> getBestSellingProducts(int amount) {
        return null;
    }
}
