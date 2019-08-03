package com.fffff.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gogo")
public class tesController {
    @RequestMapping("/")
    public String gogo(){
        return "Hello bro";
    }
}
