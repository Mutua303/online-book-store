package com.example.MutuaBooks.appAuth;

import com.example.MutuaBooks.user.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountReq {

  private String username;
  private String email;
  private String password;
  private Role role;
}
