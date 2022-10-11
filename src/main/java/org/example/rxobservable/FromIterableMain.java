package org.example.rxobservable;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.reactivex.rxjava3.core.Observable;

public class FromIterableMain {

  private static final Logger logger = LoggerFactory.getLogger(FromIterableMain.class);
  
  public static void main(String[] args) {
    List<String> fruits = List.of("strawberry", "orange", "apple");
    
    Observable<String> observable = Observable.fromIterable(fruits);
    
    observable
      .map(fruit -> fruit.toUpperCase())
      .filter(fruit -> fruit.length() > 5)
      .subscribe(logger::info);

  }

}
