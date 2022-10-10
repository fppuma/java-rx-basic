package org.example.rxbasic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.reactivex.rxjava3.core.Observable;

public class FilterMain {
  private static Logger logger = LoggerFactory.getLogger(FilterMain.class);

  public static void main(String[] args) {
     Observable<String> fruits = Observable.just("strawberry", "orange", "apple");
    
    fruits
      .map(String::length)
      .filter(length -> length > 5)
      .subscribe(length -> logger.info("{}", length));

  }

}
