package com.fatec.epopet.model.entity;

import com.fatec.epopet.model.DefaultModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client extends DefaultModel {

    private String name;
    private String address;
    private String cpf;
    private String dateOfBirth;

}
