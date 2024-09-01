package com.ahmtkzk.monolitharch.controller;

import com.ahmtkzk.monolitharch.service.StarWarsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/starwars")
public class StarWarsController {

    private final StarWarsService service;

    public StarWarsController(StarWarsService service) {
        this.service = service;
    }

    @GetMapping("/people/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String getPeopleById(@PathVariable int id) {
        service.savePeople(id);
        return "OK";
    }

}
