package org.example.rxbasic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.reactivex.rxjava3.core.Observable;

public class MapMain {
  private static Logger logger = LoggerFactory.getLogger(MapMain.class);

  public static void main(String[] args) {
    Observable<String> fruits = Observable.just("strawberry", "orange", "apple");
    
    fruits
      .map(String::length)
      .subscribe(length -> logger.info("{}", length));

  }

}
