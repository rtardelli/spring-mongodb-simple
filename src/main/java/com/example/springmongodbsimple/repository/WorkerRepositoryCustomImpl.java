package com.example.springmongodbsimple.repository;

import java.util.List;

import com.example.springmongodbsimple.models.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class WorkerRepositoryCustomImpl implements WorkerRepositoryCustom {

  @Autowired
  MongoTemplate mongoTemplate;

  @Override
  public List<Worker> findAllByRole(String roleId) {
    Query query = new Query(Criteria.where("roleId").is(roleId));
    return mongoTemplate.find(query, Worker.class);
  }
}
