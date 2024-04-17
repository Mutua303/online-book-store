package com.example.MutuaBooks.appAuth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/appAuth")
@RequiredArgsConstructor
public class authController {

  private final AuthenticationService service;

  @PostMapping("/signup")
  public ResponseEntity<authRes> signup(
      @RequestBody AccountReq request
  ) {
    return ResponseEntity.ok(service.signup(request));
  }
  @PostMapping("/signin")
  public ResponseEntity<authRes> signin(
      @RequestBody logInReq request
  ) {
    return ResponseEntity.ok(service.signin(request));
  }


}
