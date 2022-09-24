package ua.ithillel.lms.homework7.model.exeptions;

public class FileMaxSizeReachedException extends Throwable {

  public FileMaxSizeReachedException(String message) {
    super(message);
  }
}
