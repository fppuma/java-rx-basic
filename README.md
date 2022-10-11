# rx-basic

Main Console Output
```
22:27:12.496 [main] INFO org.example.rxbasic.Main - strawberry
22:27:12.500 [main] INFO org.example.rxbasic.Main - orange
22:27:12.500 [main] INFO org.example.rxbasic.Main - apple
```

MapMain (length of each element) Console Output
```
22:37:22.771 [main] INFO org.example.rxbasic.MapMain - 10
22:37:22.777 [main] INFO org.example.rxbasic.MapMain - 6
22:37:22.777 [main] INFO org.example.rxbasic.MapMain - 5
```

FilterMain (length greater than 5)
```
23:47:35.705 [main] INFO org.example.rxbasic.FilterMain - 10
23:47:35.709 [main] INFO org.example.rxbasic.FilterMain - 6
```

IntervalMain (interval with 5sec of sleep) Console Output
```
23:05:15.145 [main] INFO org.example.rxbasic.IntervalMain - Start interval
23:05:16.297 [RxComputationThreadPool-1] INFO org.example.rxbasic.IntervalMain - 0
23:05:17.297 [RxComputationThreadPool-1] INFO org.example.rxbasic.IntervalMain - 1
23:05:18.284 [RxComputationThreadPool-1] INFO org.example.rxbasic.IntervalMain - 2
23:05:19.296 [RxComputationThreadPool-1] INFO org.example.rxbasic.IntervalMain - 3
23:05:20.281 [RxComputationThreadPool-1] INFO org.example.rxbasic.IntervalMain - 4
23:05:20.297 [main] INFO org.example.rxbasic.IntervalMain - End interval
```

# rx-observable

ObservableCreator (Observable.create) Console Output
```
23:32:03.256 [main] INFO org.example.rxobservable.ObservableCreator - item: strawberry
23:32:03.263 [main] INFO org.example.rxobservable.ObservableCreator - item: orange
23:32:03.263 [main] INFO org.example.rxobservable.ObservableCreator - item: apple
```

OnNextAndOnError
```
22:49:58.896 [main] INFO org.example.rxobservable.OnNextAndOnError - item: strawberry
22:49:58.900 [main] INFO org.example.rxobservable.OnNextAndOnError - item: orange
22:49:58.905 [main] ERROR org.example.rxobservable.OnNextAndOnError - exception:
java.lang.StringIndexOutOfBoundsException: String index out of range: -2
	at java.base/java.lang.String.substring(String.java:1841)
	at org.example.rxobservable.OnNextAndOnError.lambda$0(OnNextAndOnError.java:17)
	at io.reactivex.rxjava3.internal.operators.observable.ObservableCreate.subscribeActual(ObservableCreate.java:41)
	at io.reactivex.rxjava3.core.Observable.subscribe(Observable.java:13173)
	at io.reactivex.rxjava3.core.Observable.subscribe(Observable.java:13118)
	at io.reactivex.rxjava3.core.Observable.subscribe(Observable.java:13082)
	at org.example.rxobservable.OnNextAndOnError.main(OnNextAndOnError.java:26)
```

FromIterableMain
```
23:04:40.276 [main] INFO org.example.rxobservable.FromIterableMain - STRAWBERRY
23:04:40.279 [main] INFO org.example.rxobservable.FromIterableMain - ORANGE
```

#rx-observer

ObserverMain
```
23:34:45.334 [main] INFO org.example.rxobserver.ObserverInteger - item: 10
23:34:45.339 [main] INFO org.example.rxobserver.ObserverInteger - item: 6
23:34:45.339 [main] INFO org.example.rxobserver.ObserverInteger - item: 5
23:34:45.339 [main] INFO org.example.rxobserver.ObserverInteger - ..done!
```