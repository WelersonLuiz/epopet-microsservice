package com.fatec.epopet.service.impl;

import com.fatec.epopet.model.entity.Business;
import com.fatec.epopet.repository.BusinessRepository;
import com.fatec.epopet.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;


@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    BusinessRepository businessRepository;

    @Override
    public List<Business> getAll() {
        return businessRepository.findAll();
    }

    @Override
    public Business getById(Integer id) {
        return businessRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Business post(Business entity) {
        return businessRepository.save(entity);
    }

    @Override
    public void put(Business entity) {
        businessRepository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        businessRepository.deleteById(id);
    }

    public List<Business> findProductsById(Integer id){
        return businessRepository.findBusinessById(id);
    }
}
