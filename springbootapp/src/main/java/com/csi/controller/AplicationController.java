package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AplicationController {

    @GetMapping
    public String sayHello(){
        return "WELCOME TO FINTECH CSI";
    }


    @GetMapping("/address")
    public String sayAddress(){
        return "Mumbai| Pune";
    }

    @GetMapping("/phoneservice")
    public String sayPhone(){
        return "iPhone| samsung";
    }


    @GetMapping("/service")
    public String sayServices(){
        return "Software Developemnt SErvices";
    }

    @GetMapping("/company")
    public String sayCompany(){
        return " Fintech CSI";
    }
}
