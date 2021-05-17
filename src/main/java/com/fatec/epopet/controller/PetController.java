package com.fatec.epopet.controller;

import com.fatec.epopet.model.entity.Pet;
import com.fatec.epopet.service.PetService;
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
@RequestMapping(path = "/pet")
public class PetController {

    @Autowired
    public PetService petService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Pet> getAll() {
        return petService.getAll();
    }

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Pet getById(@PathVariable Integer id) {
        return petService.getById(id);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Pet post(@RequestBody Pet entity) {
        return petService.post(entity);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void put(@RequestBody Pet entity) {
        petService.put(entity);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Integer id) {
        petService.deleteById(id);
    }
}
