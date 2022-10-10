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
