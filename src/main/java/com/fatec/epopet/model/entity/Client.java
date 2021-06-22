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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENT")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "petList"}, ignoreUnknown = true)
public class Client extends DefaultModel {

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "address")
    private String address;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_plan", referencedColumnName = "id")
    private Plan plan;

    @OneToMany(mappedBy="id", fetch = FetchType.LAZY)
    private List<Pet> petList;

}
