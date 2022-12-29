package com.csi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping
    public String companyName(){
       return "Fintech Credit Systems India Pvt. Ltd.";
    }
}
