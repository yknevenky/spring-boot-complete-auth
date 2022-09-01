package com.yknevenky.completeauthtemplate.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    public HomeController() {
    }

    @GetMapping({"/"})
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Home");
    }
}
