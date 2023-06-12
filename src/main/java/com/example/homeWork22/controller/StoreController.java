package com.example.homeWork22.controller;

import com.example.homeWork22.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class StoreController {

    private final CartService service;

    public StoreController(CartService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam("ID")List<Integer> ids) {
    service.add(ids);
    }

    @GetMapping("/get")
    public List<Integer> get() {
    return service.get();
    }
}
