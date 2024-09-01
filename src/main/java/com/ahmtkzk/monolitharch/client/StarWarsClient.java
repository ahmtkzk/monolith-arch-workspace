package com.ahmtkzk.monolitharch.client;

import com.ahmtkzk.monolitharch.model.starwars.StarWarsPeopleResponseEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "starwars-api", url = "https://swapi.dev/api")
public interface StarWarsClient {

    @GetMapping("/people/{id}")
    StarWarsPeopleResponseEntity getPeopleById(@PathVariable int id);

}
