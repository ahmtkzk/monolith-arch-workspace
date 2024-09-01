package com.ahmtkzk.monolitharch.controller;

import com.ahmtkzk.monolitharch.service.PlaceholderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/placeholder")
public class PlaceholderController {

    private final PlaceholderService service;

    public PlaceholderController(PlaceholderService service) {
        this.service = service;
    }

    @GetMapping("/post/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String getPostById(@PathVariable int id) {
        service.savePost(id);
        return "OK";
    }

}
