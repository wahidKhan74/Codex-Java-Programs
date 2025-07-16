package exception.custom;

import java.util.Date;

public class UserNotFoundException extends Exception{
  String message;
  Date timestamp;
  Throwable cause;

  UserNotFoundException(String message) {
    this.message = message;
  }

  UserNotFoundException(String message, Date timestamp) {
    this.message = message;
    this.timestamp = timestamp;
  }

  UserNotFoundException(String message, Date timestamp, Throwable cause) {
    this.message = message;
    this.timestamp = timestamp;
    this.cause = cause;
  }

  @Override
  public String getMessage() {
    return message;
  }

}
