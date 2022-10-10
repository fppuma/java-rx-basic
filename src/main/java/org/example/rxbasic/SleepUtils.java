package org.example.rxbasic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SleepUtils {

  private static Logger logger = LoggerFactory.getLogger(SleepUtils.class);
  
  public static void sleep(long miliseconds) {
    try {
      Thread.sleep(miliseconds);
    } catch (InterruptedException e) {
      logger.error("sleep exception", e);
    }
  }
}
