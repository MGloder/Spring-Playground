package com.machinedoll.wonderland.springplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPlaygroundApplication {
  public static void main(String[] args) {
    SpringApplication.run(SpringPlaygroundApplication.class, args);
  }

  @Bean
  public void init() {

  }

}
