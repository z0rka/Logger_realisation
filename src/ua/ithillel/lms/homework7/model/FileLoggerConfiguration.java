package ua.ithillel.lms.homework7.model;

public class FileLoggerConfiguration extends AbstractLoggerConfiguration {

  int fileSize = 400;

  public FileLoggerConfiguration() {
  }

  public FileLoggerConfiguration(String fileName, LoggingLevel loggingLevel) {
    super(fileName, loggingLevel);
  }
}
