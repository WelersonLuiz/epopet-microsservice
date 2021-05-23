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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BUSINESS")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "appointmentList", "businessPlanList"})
public class Business extends DefaultModel {

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "business_type")
    private String businessType;

    @Column(name = "services_available")
    private String servicesAvailable;

    @OneToMany(mappedBy="id", fetch = FetchType.LAZY)
    private List<Appointment> appointmentList;

    @OneToMany(mappedBy="id", fetch = FetchType.LAZY)
    private List<BusinessPlan> businessPlanList;

}
