package com.machinedoll.wonderland.springplayground.repository;

import com.machinedoll.wonderland.springplayground.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
}
