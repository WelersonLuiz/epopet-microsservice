package com.fatec.epopet.controller;

import com.fatec.epopet.model.entity.Business;
import com.fatec.epopet.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/business")
public class BusinessController{

    @Autowired
    public BusinessService businessService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Business> getAll() {
        return businessService.getAll();
    }

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Business getById(@PathVariable Integer id) {
        return businessService.getById(id);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Business post(@RequestBody Business entity) {
        return businessService.post(entity);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void put(@RequestBody Business entity) {
        businessService.put(entity);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Integer id) {
        businessService.deleteById(id);
    }
}
