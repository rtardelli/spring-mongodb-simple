package com.example.springmongodbsimple.repository;

import java.util.List;

import com.example.springmongodbsimple.models.Worker;

public interface WorkerRepositoryCustom {

  // customizado...oportunidade de testar o mongotemplate
  List<Worker> findAllByRole(String roleId);
}
