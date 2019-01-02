package com.szaniawski.artur.shoponline.web.controllers;

import com.szaniawski.artur.shoponline.web.constans.ModelConstans;
import com.szaniawski.artur.shoponline.web.constans.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    protected static final String WELCOME = "Welcome to our online shop!";


    @GetMapping(value = "/")
    public String welcome(Model model) {
        model.addAttribute(ModelConstans.MESSAGE, WELCOME);
        return ViewNames.WELCOME;
    }
}
