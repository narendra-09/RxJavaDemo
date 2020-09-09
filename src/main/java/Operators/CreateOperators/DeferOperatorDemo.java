package Operators.CreateOperators;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

public class DeferOperatorDemo {
    public static int start=2,count=5;
    public static void main(String[] args) {
        /*
        do not create the Observable until the observer subscribes, and create a fresh Observable for each observer
        The Defer operator waits until an observer subscribes to it, and then it generates an Observable,
        typically with an Observable factory function. It does this afresh for each subscriber,
        so although each subscriber may think it is subscribing to the same Observable,
        in fact each subscriber gets its own individual sequence.
         */
        Observable observable=Observable.defer(()->Observable.range(start,count));
        observable.subscribe(System.out::println);
        start=5;
        observable.subscribe(System.out::println);
    }
}

