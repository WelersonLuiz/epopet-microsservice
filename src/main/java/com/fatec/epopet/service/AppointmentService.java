package com.fatec.epopet.service;

import com.fatec.epopet.interfaces.GenericOperations;
import com.fatec.epopet.model.entity.Appointment;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface AppointmentService extends GenericOperations<Appointment> {

    List<Appointment> getByCustomerId(@PathVariable Integer id);

}
