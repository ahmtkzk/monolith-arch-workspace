package com.ahmtkzk.monolitharch.repository;

import com.ahmtkzk.monolitharch.model.placeholder.PlaceholderPostResponseEntity;
import org.springframework.data.repository.CrudRepository;

public interface PlaceholderRepository extends CrudRepository<PlaceholderPostResponseEntity, Integer> {
}
