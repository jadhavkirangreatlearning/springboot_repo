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
    @GetMapping("/service")
    public String sayServices(){
        return "Software Developemnt SErvices";
    }
}
