package com.yknevenky.completeauthtemplate.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserSignUpController {
    public UserSignUpController() {
    }

    @GetMapping({"/auth/signup"})
    public ResponseEntity<String> userSigIn() {
        return ResponseEntity.ok("Sign up page");
    }
}
