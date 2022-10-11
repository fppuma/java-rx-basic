package org.example.rxobserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class ObserverInteger implements Observer<Integer>{

  private static final Logger logger = LoggerFactory.getLogger(ObserverInteger.class);
  @Override
  public void onSubscribe(@NonNull Disposable d) {
    // nothing for now
    
  }

  @Override
  public void onNext(@NonNull Integer t) {
    logger.info("item: {}", t);
    
  }

  @Override
  public void onError(@NonNull Throwable e) {
    logger.error("exception:", e);
    
  }

  @Override
  public void onComplete() {
    logger.info("..done!");
    
  }

}
