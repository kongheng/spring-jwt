package com.kongheng.spring.security.jwt.service;

import com.kongheng.spring.security.jwt.entity.Role;
import com.kongheng.spring.security.jwt.entity.User;
import java.util.List;

public interface UserService {

  User saveUser(User user);
  Role saveRole(Role role);
  void addRoleToUser(String username, String roleName);
  User getUser(String username);
  List<User> getUsers();
}
