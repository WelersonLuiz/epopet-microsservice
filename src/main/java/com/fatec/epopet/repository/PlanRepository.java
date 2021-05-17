package com.fatec.epopet.repository;

import com.fatec.epopet.model.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanRepository extends JpaRepository<Plan,Integer> {

    List<Plan> findPlansById(Integer id);

}
