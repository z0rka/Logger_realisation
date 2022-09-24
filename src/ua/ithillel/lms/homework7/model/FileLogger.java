package ua.ithillel.lms.homework7.model;

import static ua.ithillel.lms.homework7.model.NewFileCreator.createNewFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import ua.ithillel.lms.homework7.model.exeptions.FileMaxSizeReachedException;
import ua.ithillel.lms.homework7.model.interfaces.AbstractLoggable;

public class FileLogger implements AbstractLoggable {

  private static FileLoggerConfiguration loggerConfiguration =
      new FileLoggerConfiguration("logger.txt", LoggingLevel.DEBUG);

  private static void writerToFile(String message) {

    loggerConfiguration.setRecordingFormat(message);

    String fullReport = loggerConfiguration.recordingFormat;

    try {
      checkBytesInFile(fullReport);
    } catch (FileMaxSizeReachedException e) {
      System.out.println(e.getMessage());
    }

    try (FileWriter writer = new FileWriter(loggerConfiguration.fileName, true)) {

      writer.write("\n" + fullReport);
      writer.flush();

    } catch (IOException ex) {
      System.out.println(ex.getMessage());

    }
  }

  private static void checkBytesInFile(String fullReport) throws FileMaxSizeReachedException {
    File file = new File(loggerConfiguration.fileName);

    if (file.length() + fullReport.length() > loggerConfiguration.fileSize) {
      createNewFile(loggerConfiguration);

      throw new FileMaxSizeReachedException(loggerConfiguration.fileName + " Max size is " +
          loggerConfiguration.fileSize + " Size we got " + file.length());
    }
  }

  public void debug(String message) {
    loggerConfiguration.loggingLevel = LoggingLevel.DEBUG;
    writerToFile(message);
  }

  public void info(String message) {
    loggerConfiguration.loggingLevel = LoggingLevel.INFO;
    writerToFile(message);

  }

  public void loadConfiguration() {
    FileLoggerConfigurationLoader fileLoggerConfigurationLoader =
        new FileLoggerConfigurationLoader();
    loggerConfiguration = fileLoggerConfigurationLoader.load();
  }
}
