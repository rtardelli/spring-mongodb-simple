package com.example.springmongodbsimple.repository;

import java.util.List;

import com.example.springmongodbsimple.models.Role;
import com.example.springmongodbsimple.models.Worker;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkerRepository extends MongoRepository<Worker, String> {

  /**
   * Obtem Workers que possuam uma determinada Role
   * @param role Função determinada
   * @return Lista de Workers
   */
  //List<Worker> findByRole(Role role);
  //List<Worker> findByFirstName(String firstName);
}
