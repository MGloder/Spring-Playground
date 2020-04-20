package com.machinedoll.wonderland.springplayground.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PropertyServiceForJasyptStarterTest {

  @Autowired
  ApplicationContext appCtx;

  @Test
  public void whenDecryptedPasswordNeeded_GetFromService() {
    System.setProperty("jasypt.encryptor.password", "password");
    PropertyServiceForJasyptStarter service = appCtx
        .getBean(PropertyServiceForJasyptStarter.class);
    System.out.println(service.getProperty());
    assertEquals("Password@1", service.getProperty());

    Environment environment = appCtx.getBean(Environment.class);
    System.out.println(service.getPasswordUsingEnvironment(environment));

    assertEquals(
        "Password@1",
        service.getPasswordUsingEnvironment(environment));
  }

}