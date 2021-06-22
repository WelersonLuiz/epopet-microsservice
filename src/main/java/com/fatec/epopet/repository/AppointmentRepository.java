package com.fatec.epopet.repository;

import com.fatec.epopet.model.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{

    List<Appointment> findAppointmentsById(Integer id);

    @Query(
            value = "SELECT * FROM APPOINTMENT A " +
                    "JOIN PET P ON A.ID_PET=P.ID " +
                    "WHERE P.ID_CLIENT = ?1",
            nativeQuery = true
    )
    List<Appointment> findByCustomerId(Integer customerId);

}
