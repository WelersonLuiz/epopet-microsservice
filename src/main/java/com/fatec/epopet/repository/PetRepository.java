package com.fatec.epopet.repository;

import com.fatec.epopet.model.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet,Integer> {

    List<Pet> findByClientId(Integer id);

}
