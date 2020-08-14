package com.example.springmongodbsimple.repository;

import com.example.springmongodbsimple.models.Worker;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkerRepository extends MongoRepository<Worker, String>, WorkerRepositoryCustom {
}
