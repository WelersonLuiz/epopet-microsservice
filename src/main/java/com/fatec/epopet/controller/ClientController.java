package com.fatec.epopet.controller;

import com.fatec.epopet.model.entity.Client;
import com.fatec.epopet.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
@RequestMapping(path = "/client")
public class ClientController {

    @Autowired
    public ClientService clientService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Client getById(@PathVariable Integer id) throws Exception {
        return clientService.getById(id);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Client post(@RequestBody Client entity) {
        return clientService.post(entity);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void put(@RequestBody Client entity) {
        clientService.put(entity);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Integer id) throws Exception {
        clientService.deleteById(id);
    }
}
