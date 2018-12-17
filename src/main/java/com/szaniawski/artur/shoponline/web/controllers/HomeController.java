package com.szaniawski.artur.shoponline.web.controllers;

import com.szaniawski.artur.shoponline.web.constans.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping (value = "/")
    public String welcome (Model model){
        return ViewNames.WELCOME;
    }
}
