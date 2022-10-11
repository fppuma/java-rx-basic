package org.example.rxobservable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.reactivex.rxjava3.core.Observable;

public class OnNextAndOnError {

  private static final Logger logger = LoggerFactory.getLogger(OnNextAndOnError.class);
  
  public static void main(String[] args) {
    Observable<String> fruits = Observable.create(source -> {
      try {
        source.onNext("strawberry");
        source.onNext("orange");
        source.onNext("apple".substring(7));
        source.onNext("peach");
        source.onComplete();
      } catch (Exception e) {
        source.onError(e);
      }
      
    });
    
    fruits.subscribe(
        f -> logger.info("item: {}", f),
        e -> logger.error("exception:", e)
        );
  }
}
