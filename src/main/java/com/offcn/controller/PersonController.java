package com.offcn.controller;

import com.offcn.dao.PersonRepository;
import com.offcn.mobel.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lgy
 * @version 1.0
 * @date 2019/12/18 20:48
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/")
    public List<Person> getAll(){
        return personRepository.findAll();
    }

    @PostMapping("/")
    public String savePer(@RequestBody Person person){
        personRepository.save(person);
        return "success";
    }

    @DeleteMapping("/")
    public String deletePer(@RequestBody Long id){

        personRepository.deleteById(id);
        return "success";
    }

    @PutMapping("/")
    public String updataPer(@RequestBody Person person){

        personRepository.saveAndFlush(person);
        return "success";
    }

}
