package com.example.springmongodbsimple.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "workers")
public class Worker {

  @Id
  private String id;
  private String name;
  private String lastName;
  private LocalDate birthday;
  private String email;
  private Role role = Role.BASIC;

  public Worker() {}

  public Worker(String name, String lastName, LocalDate birthday, String email, Role role) {
    this.name = name;
    this.lastName = lastName;
    this.birthday = birthday;
    this.email = email;
    this.role = role;
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

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "Worker{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", birthday="
      + birthday + ", email='" + email + '\'' + ", role=" + role + '}';
  }
}
