package com.szaniawski.artur.shoponline.web.controllers;

import com.szaniawski.artur.shoponline.domain.entities.PurchasedProductEntity;
import com.szaniawski.artur.shoponline.web.constans.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @GetMapping (value = "/products")
    public String findAllBooks(Model model) {
                return ViewNames.PRODUCTS;
    }
}
