package com.machinedoll.wonderland.springplayground.configuration;

import com.machinedoll.wonderland.springplayground.model.ExampleClazz;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanExampleConfig {

  @Bean
  public ExampleClazz getExampleClazz() {
    return new ExampleClazz();
  }
}
