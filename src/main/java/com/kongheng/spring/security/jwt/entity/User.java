package com.kongheng.spring.security.jwt.entity;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.AUTO;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  @Id
  @GeneratedValue(strategy = AUTO)
  private Long id;
  private String name;
  private String username;
  private String password;
  @ManyToMany(fetch = EAGER)
  private Collection<Role> roles = new ArrayList<>();
}
