package com.yknevenky.completeauthtemplate.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
    public ErrorController() {
    }

    @GetMapping({"/error"})
    public ResponseEntity<String> error() {
        return ResponseEntity.ok("Error");
    }
}
