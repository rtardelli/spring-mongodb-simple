package com.example.springmongodbsimple.controllers;

import java.net.URI;

import com.example.springmongodbsimple.models.Worker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/workers")
public class WorkerController {

  private Logger logger = LoggerFactory.getLogger(WorkerController.class);

  @GetMapping
  public ResponseEntity<Worker> all() {
    logger.info("get ALL");
    // TODO: Implementar
    return ResponseEntity.ok().build();
  }

  @PostMapping
  public ResponseEntity add(@RequestBody Worker worker) {
    logger.info("add");
    // TODO: Implementar
    return ResponseEntity.created(URI.create("/worker/1")).build();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Worker> one(@PathVariable String id) {
    logger.info("one");
    // TODO: Implementar
    return ResponseEntity.ok().build();
  }

  @PutMapping("/{id}")
  public ResponseEntity<Worker> update(@PathVariable String id) {
    logger.info("update");
    // TODO: Implementar
    return ResponseEntity.ok().build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Worker> delete(@PathVariable String id) {
    logger.info("delete");
    // TODO: Implementar
    return ResponseEntity.ok().build();
  }
}
