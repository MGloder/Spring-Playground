package com.machinedoll.wonderland.springplayground.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

  @GetMapping("/health")
  public ResponseEntity health() {
    return ResponseEntity.ok("Health Check");
  }
}
