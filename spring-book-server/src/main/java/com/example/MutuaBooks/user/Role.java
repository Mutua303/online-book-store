package com.example.MutuaBooks.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public enum Role {

  USER(Collections.emptySet()),
  ADMIN(
          Set.of(
                  com.example.MutuaBooks.user.Permission.ADMIN_READ,
                  com.example.MutuaBooks.user.Permission.ADMIN_UPDATE,
                  com.example.MutuaBooks.user.Permission.ADMIN_DELETE,
                  com.example.MutuaBooks.user.Permission.ADMIN_CREATE,
                  com.example.MutuaBooks.user.Permission.MANAGER_READ,
                  com.example.MutuaBooks.user.Permission.MANAGER_UPDATE,
                  com.example.MutuaBooks.user.Permission.MANAGER_DELETE,
                  com.example.MutuaBooks.user.Permission.MANAGER_CREATE
          )
  ),
  MANAGER(
          Set.of(
                  com.example.MutuaBooks.user.Permission.MANAGER_READ,
                  com.example.MutuaBooks.user.Permission.MANAGER_UPDATE,
                  com.example.MutuaBooks.user.Permission.MANAGER_DELETE,
                  com.example.MutuaBooks.user.Permission.MANAGER_CREATE
          )
  )

  ;

  @Getter
  private final Set<com.example.MutuaBooks.user.Permission> permissions;

  public List<SimpleGrantedAuthority> getAuthorities() {
    var authorities = getPermissions()
            .stream()
            .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
            .collect(Collectors.toList());
    authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
    return authorities;
  }
}
