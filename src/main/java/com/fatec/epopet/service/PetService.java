package com.fatec.epopet.service;

import com.fatec.epopet.interfaces.GenericOperations;
import com.fatec.epopet.model.entity.Pet;

import java.util.List;

public interface PetService extends GenericOperations<Pet> {

    List<Pet> findByIdClient(Integer id);

}
