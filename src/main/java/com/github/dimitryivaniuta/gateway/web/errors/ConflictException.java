package com.github.dimitryivaniuta.gateway.web.errors;

/** 409 Conflict. */
public class ConflictException extends RuntimeException {
  public ConflictException(String message) { super(message); }
}
