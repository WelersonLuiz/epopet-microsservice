package com.fatec.epopet.repository;

import com.fatec.epopet.model.entity.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusinessRepository extends JpaRepository<Business,Integer> {

    List<Business> findBusinessById(Integer id);

}
