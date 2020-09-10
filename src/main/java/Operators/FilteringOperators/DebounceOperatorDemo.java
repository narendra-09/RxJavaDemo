package Operators.FilteringOperators;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class DebounceOperatorDemo {
    public static void main(String[] args) {
        Observable<Integer> observable=Observable.fromArray(1,2,3,4,5).debounce(1, TimeUnit.SECONDS);
        observable.subscribe(System.out::println);
    }
}
