package com.example.springmongodbsimple.repository;

import com.example.springmongodbsimple.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
}
