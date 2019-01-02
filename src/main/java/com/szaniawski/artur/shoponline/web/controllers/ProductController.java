package com.szaniawski.artur.shoponline.web.controllers;

import com.szaniawski.artur.shoponline.domain.entities.PurchasedProductEntity;
import com.szaniawski.artur.shoponline.domain.types.PurchasedProductTO;
import com.szaniawski.artur.shoponline.peristance.services.CustomerService;
import com.szaniawski.artur.shoponline.peristance.services.PurchasedProductService;
import com.szaniawski.artur.shoponline.web.constans.ModelConstans;
import com.szaniawski.artur.shoponline.web.constans.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.View;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    PurchasedProductService purchasedProductService;

    @GetMapping(value = "/products")
    public String findAllBooks(Model model) {
        List<PurchasedProductTO> listOfAllProducts = purchasedProductService.findAllPurchasedProducts();
        model.addAttribute(ModelConstans.PRODUCTS, listOfAllProducts);
        return ViewNames.PRODUCTS;
    }

    @DeleteMapping(value = "products/remove/{productId}")
    public String deleteProduct(@RequestParam("id") Long id, Model model) {
        purchasedProductService.removeProduct(id);
        return ViewNames.PRODUCTS;
    }

    @PutMapping(value = "/addProduct")
    public String addProduct(Model model) {
        model.addAttribute("newProduct", new PurchasedProductTO());
        return ViewNames.ADDPRODUCT;

    }
}
