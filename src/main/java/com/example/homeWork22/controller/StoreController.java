package com.example.homeWork22.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/order")
public class StoreController {

    @GetMapping("/add")
    public void add() {

    }

    @GetMapping("/get")
    public void get() {

    }
}
