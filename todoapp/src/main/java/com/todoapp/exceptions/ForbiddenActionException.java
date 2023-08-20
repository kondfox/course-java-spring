package com.todoapp.exceptions;

public class ForbiddenActionException extends RuntimeException {

  public static final String MESSAGE = "HÉHÉ-NONÓ, ilyet nem szabad!";

  public ForbiddenActionException() {
    super(MESSAGE);
  }

}
