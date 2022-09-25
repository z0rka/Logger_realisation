package ua.ithillel.lms.homework7.model;

import ua.ithillel.lms.homework7.model.properties.LoggingLevel;

public class FileLoggerConfiguration extends AbstractLoggerConfiguration {

  private int fileSize = 400;

  public FileLoggerConfiguration() {
  }

  public FileLoggerConfiguration(String fileName, LoggingLevel loggingLevel) {
    super(fileName, loggingLevel);
  }

  public int getFileSize() {
    return fileSize;
  }

  public void setFileSize(int fileSize) {
    if (fileSize < 1) {
      this.fileSize = 400;
      System.out.println("Incorrect file size , set as default (400)");
    }

    this.fileSize = fileSize;
  }
}
