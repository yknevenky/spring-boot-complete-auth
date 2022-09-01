package com.yknevenky.completeauthtemplate.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    public AdminController() {
    }

    @GetMapping({"/admin"})
    public ResponseEntity<String> userSigIn() {
        return ResponseEntity.ok("Admin page");
    }
}