package com.fatec.epopet.service.impl;

import com.fatec.epopet.model.entity.Appointment;
import com.fatec.epopet.repository.AppointmentRepository;
import com.fatec.epopet.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getById(Integer id) {
        return appointmentRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Appointment post(Appointment entity) {
        return appointmentRepository.save(entity);
    }

    @Override
    public void put(Appointment entity) {
        appointmentRepository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        appointmentRepository.deleteById(id);
    }

    public List<Appointment> findProductsById(Integer id){
        return appointmentRepository.findAppointmentsById(id);
    }
}
