package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")

public class CarController {

    @RequestMapping("/info") //localhost:8080/car/info?make=Honda
    public String carInfo(@RequestParam String make, Model model){

        model.addAttribute("make",make);
        //System.out.println(make);

        return "car/car-info";
    }
}
