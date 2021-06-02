package com.fatec.epopet.repository;

import com.fatec.epopet.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {

    List<Client> findClientsById(Integer id);

    @Query(
        value = "SELECT * FROM CLIENT u WHERE u.email = ?1",
        nativeQuery = true
    )
    Optional<Client> findByEmail(String email);

}
