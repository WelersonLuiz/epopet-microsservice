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
@Table(name = "PET")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "appointmentList", "client"})
public class Pet extends DefaultModel {

    @Column(name = "name")
    private String name;

    @Column(name = "species")
    private String species;

    @Column(name = "size_type")
    private String sizeType;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "id_client")
    private String id_client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client", referencedColumnName = "id", updatable=false, insertable = false)
    private Client client;

    @OneToMany(mappedBy="id", fetch = FetchType.LAZY)
    private List<Appointment> appointmentList;

}
