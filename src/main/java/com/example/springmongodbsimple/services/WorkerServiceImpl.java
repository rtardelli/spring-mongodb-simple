package com.example.springmongodbsimple.services;

import java.util.List;
import java.util.Optional;

import com.example.springmongodbsimple.models.Worker;
import com.example.springmongodbsimple.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerServiceImpl implements WorkerService {

  @Autowired
  private WorkerRepository workerRepository;

  @Override
  public List<Worker> getAll() {
    return workerRepository.findAll();
  }

  @Override
  public Worker add(Worker worker) {
    // valid
    return workerRepository.save(worker);
  }

  @Override
  public Optional<Worker> get(String id) {
    return workerRepository.findById(id);
  }

  @Override
  public Worker update(String id, Worker worker) {

    // valid
    Optional<Worker> w = workerRepository.findById(id);

    w.get().setName(worker.getName());
    w.get().setLastName(worker.getLastName());
    w.get().setBirthday(worker.getBirthday());
    w.get().setEmail(worker.getEmail());
    w.get().setRoleId(worker.getRoleId());

    return workerRepository.save(w.get());
  }

  @Override
  public void delete(String id) {
    workerRepository.deleteById(id);
  }

  private boolean valid(Worker worker) {
    return true;
  }
}
