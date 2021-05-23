package com.fatec.epopet.model.entity;

import com.fatec.epopet.model.DefaultModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
@Table(name = "BUSINESS_PLAN")
public class BusinessPlan extends DefaultModel {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_plan", referencedColumnName = "id")
    private Plan plan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_business", referencedColumnName = "id")
    private Business business;

}
