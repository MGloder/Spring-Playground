package com.machinedoll.wonderland.springplayground.repository;

import com.machinedoll.wonderland.springplayground.model.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository extends CrudRepository<Staff, Long> {
  List<Staff> findAllByName(String name);
}
