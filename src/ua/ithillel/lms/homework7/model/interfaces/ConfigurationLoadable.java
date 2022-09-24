package ua.ithillel.lms.homework7.model.interfaces;

import ua.ithillel.lms.homework7.model.AbstractLoggerConfiguration;
import ua.ithillel.lms.homework7.model.FileLoggerConfiguration;

public interface ConfigurationLoadable {

  AbstractLoggerConfiguration load();
}
