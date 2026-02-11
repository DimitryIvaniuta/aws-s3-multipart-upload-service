package com.github.dimitryivaniuta.gateway.web.errors;

/** 400 Bad request. */
public class BadRequestException extends RuntimeException {
  public BadRequestException(String message) { super(message); }
}
