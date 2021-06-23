package com.fatec.epopet.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fatec.epopet.model.DefaultModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "APPOINTMENT")
@JsonIgnoreProperties({"pet","business"})

public class Appointment extends DefaultModel {

    @Column(name = "appointment_date")
    private String appointmentDate;

    @Column(name = "service_type")
    private String serviceType;

    @Column(name = "id_business")
    private String id_business;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_business", referencedColumnName = "id", updatable=false, insertable = false)
    private Business business;

    @Column(name = "id_pet")
    private String id_pet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pet", referencedColumnName = "id", updatable=false, insertable = false)
    private Pet pet;

}
