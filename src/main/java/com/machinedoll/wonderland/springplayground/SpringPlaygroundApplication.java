package com.machinedoll.wonderland.springplayground;

import com.machinedoll.wonderland.springplayground.model.Customer;
import com.machinedoll.wonderland.springplayground.model.Staff;
import com.machinedoll.wonderland.springplayground.repository.CustomerRepository;
import com.machinedoll.wonderland.springplayground.repository.StaffRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPlaygroundApplication {
  Logger log = LoggerFactory.getLogger(SpringPlaygroundApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(SpringPlaygroundApplication.class, args);
  }

  @Bean
  public CommandLineRunner demo(CustomerRepository customerRepository) {
    return (args) -> {
      customerRepository.save(new Customer("Jack", "Bauer"));
      customerRepository.save(new Customer("Jack", "Bauer"));
      customerRepository.save(new Customer("Jack", "Bauer"));

      log.info("Find all customer with find all");
      for (Customer c : customerRepository.findAll()) {
        log.info(c.toString());
      }

      log.info("Find customer with join command");
    };
  }

  @Bean
  public CommandLineRunner demo2(StaffRepository staffRepository) {
    return (args) -> {

      log.info("Find all staff with find all");
      for (Staff s : staffRepository.findAll()) {
        log.info(s.toString());
      }

      log.info("");
    };
  }

}
