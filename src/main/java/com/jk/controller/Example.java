package com.jk.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//@RestController = contrtoller + responseBody
@Controller
@EnableAutoConfiguration
public class Example {
    @ResponseBody
    @RequestMapping("/ht")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/hello/{myName}")
    @ResponseBody
    String index(@PathVariable String myName) {
        return "Hello "+myName+"!!!";
    }

    @RequestMapping("/sel")
    public String sel(Model model){
        return "sel";

    }
}
