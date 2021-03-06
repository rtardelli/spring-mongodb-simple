package com.example.springmongodbsimple.models;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
public class Role {

  @Id
  private String id;

  @NotBlank(message = "Nome obrigatório")
  private String name;

  public Role() {
  }

  public Role(String id, @NotBlank(message = "Nome obrigatório") String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Role{" + "id='" + id + '\'' + ", name='" + name + '\'' + '}';
  }
}
