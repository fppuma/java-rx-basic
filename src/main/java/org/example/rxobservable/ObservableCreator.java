package org.example.rxobservable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.reactivex.rxjava3.core.Observable;

public class ObservableCreator {

  private static final Logger logger = LoggerFactory.getLogger(ObservableCreator.class);
  
  public static void main(String[] args) {
    Observable<String> fruits = Observable.create(source -> {
      source.onNext("strawberry");
      source.onNext("orange");
      source.onNext("apple");
      source.onComplete();
    });
    
    fruits.subscribe(f -> logger.info("item: {}", f));
  }

}
