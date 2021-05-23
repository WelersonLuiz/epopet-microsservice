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
@Table(name = "PLAN")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "clientList", "businessPlanList"})
public class Plan extends DefaultModel {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "monthly_price")
    private String monthlyPrice;

    @OneToMany(mappedBy="id", fetch = FetchType.LAZY)
    private List<Client> clientList;

    @OneToMany(mappedBy="id", fetch = FetchType.LAZY)
    private List<BusinessPlan> businessPlanList;

}
