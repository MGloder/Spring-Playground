package com.machinedoll.wonderland.springplayground.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class RecordNotFoundException extends Exception {
  private static final long serialVersionUID = 1L;

  public RecordNotFoundException(String message) {
    super(message);
  }

  public RecordNotFoundException(String message, Throwable t) {
    super(message, t);
  }
}
