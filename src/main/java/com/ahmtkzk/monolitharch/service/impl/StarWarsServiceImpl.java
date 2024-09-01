package com.ahmtkzk.monolitharch.service.impl;

import com.ahmtkzk.monolitharch.client.StarWarsClient;
import com.ahmtkzk.monolitharch.model.starwars.StarWarsPeopleResponseEntity;
import com.ahmtkzk.monolitharch.repository.StarWarsRepository;
import com.ahmtkzk.monolitharch.service.StarWarsService;
import org.springframework.stereotype.Service;

@Service
public class StarWarsServiceImpl implements StarWarsService {

    private final StarWarsRepository repository;
    private final StarWarsClient client;

    public StarWarsServiceImpl(StarWarsRepository repository, StarWarsClient client) {
        this.repository = repository;
        this.client = client;
    }

    @Override
    public void savePeople(int id) {
        StarWarsPeopleResponseEntity entity = client.getPeopleById(id);
        repository.save(entity);
    }

}
