package com.fatec.epopet.controller;

import com.fatec.epopet.model.entity.Plan;
import com.fatec.epopet.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping(path = "/plan")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PlanController {

    @Autowired
    public PlanService planService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Plan> getAll() {
        return planService.getAll();
    }

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Plan getById(@PathVariable Integer id) {
        return planService.getById(id);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Plan post(@RequestBody Plan entity) {
        return planService.post(entity);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void put(@RequestBody Plan entity) {
        planService.put(entity);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable Integer id) {
        planService.deleteById(id);
    }

}
