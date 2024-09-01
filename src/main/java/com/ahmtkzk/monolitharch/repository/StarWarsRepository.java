package com.ahmtkzk.monolitharch.repository;

import com.ahmtkzk.monolitharch.model.starwars.StarWarsPeopleResponseEntity;
import org.springframework.data.repository.CrudRepository;

public interface StarWarsRepository extends CrudRepository<StarWarsPeopleResponseEntity, Integer> {
}
