package com.machinedoll.wonderland.springplayground.controller;

import com.machinedoll.wonderland.springplayground.exception.RecordNotFoundException;
import com.machinedoll.wonderland.springplayground.model.Customer;
import com.machinedoll.wonderland.springplayground.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

  @Autowired
  CustomerService customerService;

  @GetMapping
  public ResponseEntity<List<Customer>> getAllCustomers() {
    List<Customer> allCustomers = customerService.getAllCustomer();
    return new ResponseEntity<>(allCustomers, new HttpHeaders(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Customer> getCustomerByCustomerId(@PathVariable("id") Long id) throws RecordNotFoundException {
    Customer returnedCustomer = customerService.getCustomerById(id);
    return new ResponseEntity<Customer>(returnedCustomer, new HttpHeaders(), HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public HttpStatus deleteCustomerById(@PathVariable("id") Long id) throws RecordNotFoundException {
    customerService.deleteCustomerById(id);
    return HttpStatus.FORBIDDEN;
  }

  @PostMapping
  public ResponseEntity<Customer> createOrUpdateCustomer(Customer customer) {
    Customer updateCustomer = customerService.createOrUpdateCustomerById(customer);
    return new ResponseEntity<>(updateCustomer, new HttpHeaders(), HttpStatus.OK);
  }

}
