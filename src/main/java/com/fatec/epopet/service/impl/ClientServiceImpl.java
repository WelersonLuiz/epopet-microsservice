package com.fatec.epopet.service.impl;

import com.fatec.epopet.model.entity.Client;
import com.fatec.epopet.repository.ClientRepository;
import com.fatec.epopet.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client getById(Integer id) {
        return clientRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Client post(Client entity) {
        return clientRepository.save(entity);
    }

    @Override
    public void put(Client entity) {
        clientRepository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        clientRepository.deleteById(id);
    }

    public List<Client> findProductsById(Integer id){
        return clientRepository.findClientsById(id);
    }
}