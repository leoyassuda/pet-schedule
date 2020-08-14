package br.com.lny.petschedule.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RoufController {

    @GetMapping
    public String hello(){
        return "Rouf! Hi there!";
    }
}
