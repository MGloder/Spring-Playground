package com.machinedoll.wonderland.springplayground.repository;

import com.machinedoll.wonderland.springplayground.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

  Customer findById(String id);

  List<Customer> findAllByFirstName(String firstName);
}
