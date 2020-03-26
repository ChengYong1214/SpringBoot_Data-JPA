package com.yong.demo.dao;

import com.yong.demo.entity.Dog;
import org.springframework.data.repository.CrudRepository;


public interface DogRepository extends CrudRepository<Dog,Integer> {

}
