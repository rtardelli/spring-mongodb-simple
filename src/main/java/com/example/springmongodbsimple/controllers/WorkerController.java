package com.example.springmongodbsimple.controllers;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import com.example.springmongodbsimple.models.Worker;
import com.example.springmongodbsimple.services.WorkerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/workers")
public class WorkerController {

  private final Logger LOG = LoggerFactory.getLogger(getClass());

  @Autowired
  WorkerService service;

  @GetMapping
  public ResponseEntity<List<Worker>> all() {
    LOG.info("Getting all workers");
    return ResponseEntity.ok(service.getAll());
  }

  @PostMapping
  public ResponseEntity add(@Valid @RequestBody Worker worker) {
    LOG.info("Saving worker");
    Worker w = service.add(worker);
    return ResponseEntity.created(URI.create("/worker/" + w.getId())).build();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Worker> one(@PathVariable String id) {
    LOG.info("Getting worker with id: {}.", id);
    Optional<Worker> response = service.get(id);
    if(!response.isPresent()) {
      return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok(response.get());
  }

  @PutMapping("/{id}")
  public ResponseEntity<Worker> update(@PathVariable String id, @Valid @RequestBody Worker worker) {
    LOG.info("update of {}", id);
    if(!service.get(id).isPresent()) {
      return ResponseEntity.notFound().build();
    }

    service.update(id, worker);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Worker> delete(@PathVariable String id) {
    LOG.info("delete");
    if(!service.get(id).isPresent()) {
      return ResponseEntity.notFound().build();
    }

    return ResponseEntity.noContent().build();
  }

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public Map<String, String> handleValidationExceptions(
    MethodArgumentNotValidException ex) {
    Map<String, String> errors = new HashMap<>();
    ex.getBindingResult().getAllErrors().forEach((error) -> {
      String fieldName = ((FieldError) error).getField();
      String errorMessage = error.getDefaultMessage();
      errors.put(fieldName, errorMessage);
    });
    return errors;
  }
}
