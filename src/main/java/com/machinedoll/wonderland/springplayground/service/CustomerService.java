package com.machinedoll.wonderland.springplayground.service;

import com.machinedoll.wonderland.springplayground.exception.RecordNotFoundException;
import com.machinedoll.wonderland.springplayground.model.Customer;
import com.machinedoll.wonderland.springplayground.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

  @Autowired
  CustomerRepository customerRepository;

  public List<Customer> getAllCustomer() {
    List<Customer> allCustomers = customerRepository.findAll();
    if (allCustomers.size() > 0) {
      return allCustomers;
    } else {
      return Arrays.asList();
    }
  }

  public Customer getCustomerById(Long id) throws RecordNotFoundException {
    Optional<Customer> customer = customerRepository.findById(id);
    if (customer.isPresent()) {
      return customer.get();
    } else {
      throw new RecordNotFoundException("No employee record exist for given id");
    }
  }

  public Customer createOrUpdateCustomerById(Customer customer) {
    Optional<Customer> returnedCustomer = customerRepository.findById(customer.getCustomer_id());
    if (returnedCustomer.isPresent()) {
      returnedCustomer.get().setCustomer_id(customer.getCustomer_id());
      returnedCustomer.get().setFirstName(customer.getFirstName());
      returnedCustomer.get().setLastName(customer.getLastName());
    } else {
      customerRepository.save(customer);
    }
    return customer;
  }

  public void deleteCustomerById(Long id) throws RecordNotFoundException {
    Optional<Customer> employee = customerRepository.findById(id);

    if (employee.isPresent()) {
      customerRepository.deleteById(id);
    } else {
      throw new RecordNotFoundException("No employee record exist for given id");
    }
  }

}
