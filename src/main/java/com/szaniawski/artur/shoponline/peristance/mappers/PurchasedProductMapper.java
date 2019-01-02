package com.szaniawski.artur.shoponline.peristance.mappers;

import com.szaniawski.artur.shoponline.domain.entities.OrderEntity;
import com.szaniawski.artur.shoponline.domain.entities.PurchasedProductEntity;
import com.szaniawski.artur.shoponline.domain.types.PurchasedProductTO;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PurchasedProductMapper {

    @PersistenceContext
    private EntityManager entityManager;

    public PurchasedProductTO toPurchasedProductTO(PurchasedProductEntity purchasedProductEntity) {
        if (purchasedProductEntity == null)
            return null;

        PurchasedProductTO.PurchasedProductTOBuilder purchasedProductTOBuilder = new PurchasedProductTO.PurchasedProductTOBuilder()
                .withVersion(purchasedProductEntity.getVersion()).withId(purchasedProductEntity.getId())
                .withProductName(purchasedProductEntity.getProductName()).withPrice(purchasedProductEntity.getPrice())
                .withMargin(purchasedProductEntity.getMargin()).withWeight(purchasedProductEntity.getWeight());
        if (purchasedProductEntity.getOrders() != null) {
            purchasedProductTOBuilder.withOrders(
                    purchasedProductEntity.getOrders().stream().map(e -> e.getId()).collect(Collectors.toList()));

        }
        return purchasedProductTOBuilder.build();
    }


    public PurchasedProductEntity toPurchasedProductEntity(PurchasedProductTO purchasedProductTO) {
        if (purchasedProductTO == null)
            return null;

        List<Long> orders = purchasedProductTO.getOrders();
        List<OrderEntity> listOfOrders = new ArrayList<>();
        if (orders != null) {
            for (Long id : orders) {
                listOfOrders.add(entityManager.getReference(OrderEntity.class, id));
            }
        }

        PurchasedProductEntity.PurchasedProductEntityBuilder purchasedProductEntityBuilder = new PurchasedProductEntity.PurchasedProductEntityBuilder()
                .withVersion(purchasedProductTO.getVersion()).withId(purchasedProductTO.getId())
                .withProductName(purchasedProductTO.getProductName()).withPrice(purchasedProductTO.getPrice())
                .withMargin(purchasedProductTO.getMargin()).withWeight(purchasedProductTO.getWeight());

        return purchasedProductEntityBuilder.build();

    }


    public List<PurchasedProductTO> map2TOs(List<PurchasedProductEntity> purchasedProductEntities) {
        return purchasedProductEntities.stream().map(this::toPurchasedProductTO).collect(Collectors.toList());
    }

    public List<PurchasedProductEntity> map2Entities(List<PurchasedProductTO> purchasedProductTOs) {
        return purchasedProductTOs.stream().map(this::toPurchasedProductEntity).collect(Collectors.toList());
    }
}
