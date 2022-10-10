package org.example.rxbasic;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.reactivex.rxjava3.core.Observable;

public class IntervalMain {

  private static final Logger logger = LoggerFactory.getLogger(IntervalMain.class);
  
  public static void main(String[] args) {
    logger.info("Start interval");
    
    Observable<Long> numbers = Observable.interval(1, TimeUnit.SECONDS);
    numbers.subscribe(n -> logger.info("{}", n));
    
    SleepUtils.sleep(5000);  
    logger.info("End interval");
  }

}
