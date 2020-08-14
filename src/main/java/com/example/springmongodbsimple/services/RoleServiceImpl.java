package com.example.springmongodbsimple.services;

import java.util.List;
import java.util.Optional;

import com.example.springmongodbsimple.models.Role;
import com.example.springmongodbsimple.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

  @Autowired
  private RoleRepository roleRepository;

  @Override
  public List<Role> getAll() {
    return roleRepository.findAll();
  }

  @Override
  public Role add(Role role) {
    // valid
    return roleRepository.save(role);
  }

  @Override
  public Optional<Role> get(String id) {
    return roleRepository.findById(id);
  }

  @Override
  public Role update(String id, Role role) {

    // valid
    Optional<Role> r = roleRepository.findById(id);
    r.get().setName(role.getName());

    return roleRepository.save(r.get());
  }

  @Override
  public void delete(String id) {
    roleRepository.deleteById(id);
  }

  private boolean valid(Role role) {
    return true;
  }
}
