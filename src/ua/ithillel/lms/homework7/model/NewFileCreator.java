package ua.ithillel.lms.homework7.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewFileCreator {

  private static int i = 1;

  static void setNewFileName(FileLoggerConfiguration loggerConfiguration) {
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy-HH.mm.ss");

    loggerConfiguration.fileName = "logger" + i + "_" + formatter.format(date) + ".txt";
    i++;

  }
}
