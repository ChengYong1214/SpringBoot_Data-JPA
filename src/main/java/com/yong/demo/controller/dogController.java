package com.yong.demo.controller;

import com.yong.demo.dao.DogRepository;
import com.yong.demo.entity.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Optional;

@Controller
public class dogController {
    @Autowired
    private DogRepository dogRepository;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insertDog(Dog dog){
        Dog dog1=dogRepository.save(dog);
        return dog1.toString();
          }

    @RequestMapping("/find")
    @ResponseBody
    public String findDog(Integer id){
       Optional<Dog> dog = dogRepository.findById(id);
       return dog.toString();
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    public String deleteById(Integer id){
        dogRepository.deleteById(id);
        return "删除成功！";
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){
        return dogRepository.findAll().toString();
    }

}
