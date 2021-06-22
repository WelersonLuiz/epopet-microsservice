package com.fatec.epopet.repository;

import com.fatec.epopet.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {

    Optional<Client> findByEmail(String email);
    Optional<Client> findByCpf(String email);

}
