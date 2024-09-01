package com.ahmtkzk.monolitharch.service.impl;

import com.ahmtkzk.monolitharch.client.PlaceholderClient;
import com.ahmtkzk.monolitharch.model.placeholder.PlaceholderPostResponseEntity;
import com.ahmtkzk.monolitharch.repository.PlaceholderRepository;
import com.ahmtkzk.monolitharch.service.PlaceholderService;
import org.springframework.stereotype.Service;

@Service
public class PlaceholderServiceImpl implements PlaceholderService {

    private final PlaceholderRepository repository;
    private final PlaceholderClient client;

    public PlaceholderServiceImpl(PlaceholderRepository repository, PlaceholderClient client) {
        this.repository = repository;
        this.client = client;
    }

    @Override
    public void savePost(int id) {
        PlaceholderPostResponseEntity entity = client.getPostById(id);
        repository.save(entity);
    }

}
