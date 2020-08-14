package com.example.springmongodbsimple.models;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "workers")
public class Worker {

  @Id
  private String id;

  @NotBlank(message = "Nome obrigatório")
  private String name;

  @NotBlank(message = "Sobrenome obrigatório")
  private String lastName;

  @Past
  private LocalDate birthday;

  @Email(message = "Email inválido")
  private String email;

  @NotBlank(message = "Perfil obrigatório")
  private String roleId;

  public Worker() {}

  public Worker(String name, String lastName, LocalDate birthday, String email, String roleId) {
    this.name = name;
    this.lastName = lastName;
    this.birthday = birthday;
    this.email = email;
    this.roleId = roleId;
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

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  @Override
  public String toString() {
    return "Worker{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", birthday="
      + birthday + ", email='" + email + '\'' + ", roleId=" + roleId + '}';
  }
}
