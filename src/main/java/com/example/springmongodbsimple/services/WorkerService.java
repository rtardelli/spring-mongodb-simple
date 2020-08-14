package com.example.springmongodbsimple.services;

import java.util.List;
import java.util.Optional;

import com.example.springmongodbsimple.models.Worker;

public interface WorkerService {

  List<Worker> getAll();
  Worker add(Worker worker);
  Optional<Worker> get(String id);
  Worker update(String id, Worker worker);
  void delete(String id);
}
