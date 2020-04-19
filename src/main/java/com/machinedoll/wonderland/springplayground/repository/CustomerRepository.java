package com.machinedoll.wonderland.springplayground.repository;

import com.machinedoll.wonderland.springplayground.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
