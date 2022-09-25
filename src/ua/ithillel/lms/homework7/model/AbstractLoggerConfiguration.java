package ua.ithillel.lms.homework7.model;

import java.util.Date;
import ua.ithillel.lms.homework7.model.enums.LoggingLevel;

public abstract class AbstractLoggerConfiguration {

  protected String fileName;
  protected LoggingLevel loggingLevel;
  protected Date date = new Date();
  protected String recordingFormat =
      "|" + date + "|" + loggingLevel + "|" + " Message : ";

  public AbstractLoggerConfiguration() {
  }

  public AbstractLoggerConfiguration(String fileName, LoggingLevel loggingLevel) {
    this.fileName = fileName;
    this.loggingLevel = loggingLevel;
  }

  public void setRecordingFormat(String message,LoggingLevel loggingLevel) {
    this.recordingFormat = "|" + date.toString() + "|" + loggingLevel
        + "|" + " Message : " + message;
  }
}
