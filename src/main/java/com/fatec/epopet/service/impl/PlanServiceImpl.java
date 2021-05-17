package com.fatec.epopet.service.impl;

import com.fatec.epopet.model.entity.Plan;
import com.fatec.epopet.repository.PlanRepository;
import com.fatec.epopet.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    PlanRepository planRepository;

    @Override
    public List<Plan> getAll() {
        return planRepository.findAll();
    }

    @Override
    public Plan getById(Integer id) {
        return planRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Plan post(Plan entity) {
        return planRepository.save(entity);
    }

    @Override
    public void put(Plan entity) {
        planRepository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        planRepository.deleteById(id);
    }

    public List<Plan> findProductsById(Integer id){
        return planRepository.findPlansById(id);
    }
}
