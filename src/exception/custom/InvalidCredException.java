package exception.custom;

import java.util.Date;

public class InvalidCredException extends RuntimeException{
  String message;
  // optional 
  Date timestamp;
  Throwable cause;

  InvalidCredException(String message) {
    this.message = message;
  }

  InvalidCredException(String message, Date timestamp) {
    this.message = message;
    this.timestamp = timestamp;
  }

  InvalidCredException(String message, Date timestamp, Throwable cause) {
    this.message = message;
    this.timestamp = timestamp;
    this.cause = cause;
  }

  @Override
  public String getMessage() {
    return message;
  }

}
