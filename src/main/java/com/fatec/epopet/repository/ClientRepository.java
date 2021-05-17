package com.fatec.epopet.repository;

import com.fatec.epopet.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {

    List<Client> findClientsById(Integer id);

}
