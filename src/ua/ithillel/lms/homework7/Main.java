package ua.ithillel.lms.homework7;

import ua.ithillel.lms.homework7.model.FileLogger;

public class Main {


  public static void main(String[] args) {

    FileLogger logger = new FileLogger();

    for (int i = 0; i < 10; i++) {
      logger.debug("Test1");
    }
  }
}
