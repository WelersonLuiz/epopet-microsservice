package com.fatec.epopet.service.impl;

import com.fatec.epopet.model.entity.Pet;
import com.fatec.epopet.repository.PetRepository;
import com.fatec.epopet.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    PetRepository petRepository;

    @Override
    public List<Pet> getAll() {
        return petRepository.findAll();
    }

    @Override
    public Pet getById(Integer id) {
        return petRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Pet post(Pet entity) {
        return petRepository.save(entity);
    }

    @Override
    public void put(Pet entity) {
        petRepository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        petRepository.deleteById(id);
    }

    @Override
    public List<Pet> findByIdClient(Integer id){
        return petRepository.findByClientId(id);
    }

}
