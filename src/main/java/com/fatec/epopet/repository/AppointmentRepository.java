package com.fatec.epopet.repository;

import com.fatec.epopet.model.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {

    List<Appointment> findAppointmentsById(Integer id);

}
