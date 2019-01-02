package com.szaniawski.artur.shoponline.web.controllers;

import com.szaniawski.artur.shoponline.domain.types.CustomerTO;
import com.szaniawski.artur.shoponline.peristance.services.CustomerService;
import com.szaniawski.artur.shoponline.web.constans.ModelConstans;
import com.szaniawski.artur.shoponline.web.constans.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerContoller {

    @Autowired
    CustomerService customerService;


    @GetMapping(value = "/customers")
    public String findAllBooks(Model model) {
        List<CustomerTO> listOfAllCustomers = customerService.findAllCustomers();
        model.addAttribute(ModelConstans.CUSTOMERS, listOfAllCustomers);
        return ViewNames.CUSTOMERS;
    }


}
