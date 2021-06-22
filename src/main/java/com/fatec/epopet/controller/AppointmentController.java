package com.fatec.epopet.controller;

import com.fatec.epopet.model.entity.Appointment;
import com.fatec.epopet.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
@RequestMapping(path = "/appointment")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AppointmentController{

    @Autowired
    public AppointmentService appointmentService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Appointment> getAll() {
        return appointmentService.getAll();
    }

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Appointment getById(@PathVariable Integer id) {
        return appointmentService.getById(id);
    }

    @GetMapping(value = "/client/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Appointment> getByCustomerId(@PathVariable Integer id) {
        return appointmentService.getByCustomerId(id);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Appointment post(@RequestBody Appointment entity) {
        return appointmentService.post(entity);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void put(@RequestBody Appointment entity) {
        appointmentService.put(entity);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Integer id) {
        appointmentService.deleteById(id);
    }

}
