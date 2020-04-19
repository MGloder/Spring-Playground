package com.machinedoll.wonderland.springplayground.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "staff")
public class Staff {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "staff_id")
  private String staffId;

  @ManyToMany(cascade = {
      CascadeType.PERSIST,
      CascadeType.MERGE
  })
  @JoinTable(name = "order_customer",
      joinColumns = @JoinColumn(name = "customer_id"),
      inverseJoinColumns = @JoinColumn(name = "staff_id")
  )
  private Set<Customer> customers = new HashSet<>();

  public void addCustomer(Customer customer) {
    customers.add(customer);
    customer.getStaff().add(this);
  }

  public void removeTag(Customer customer) {
    customers.remove(customer);
    customer.getStaff().remove(this);
  }

}
