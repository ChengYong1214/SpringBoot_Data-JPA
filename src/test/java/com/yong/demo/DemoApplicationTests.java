package com.yong.demo;

import com.yong.demo.dao.DogRepository;
import com.yong.demo.entity.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private DogRepository dogRepository;
    @Test
    void contextLoads() {
        //ID查询
       // System.out.println( dogRepository.findById(1));
        //添加
       /* Dog dog=new Dog();
        dog.setAge(12);
        dog.setName("换上");
        dog.setType("哈哈");
        dogRepository.save(dog);*/
       //查全部
        //System.out.println(  dogRepository.findAll().toString());
        dogRepository.deleteById(1);
    }

}
