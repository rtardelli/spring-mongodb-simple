package com.example.springmongodbsimple.services;

import java.util.List;
import java.util.Optional;

import com.example.springmongodbsimple.models.Role;

public interface RoleService {

  List<Role> getAll();
  Role add(Role role);
  Optional<Role> get(String id);
  Role update(String id, Role role);
  void delete(String id);
}
