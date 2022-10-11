package org.example.rxobserver;

import io.reactivex.rxjava3.core.Observable;

public class ObserverMain {
  
  public static void main(String[] args) {
    Observable<String> fruits = Observable.just("strawberry", "orange", "apple");
    
    fruits
      .map(fruit -> fruit.length())
      .subscribe(new ObserverInteger());
  }

}
