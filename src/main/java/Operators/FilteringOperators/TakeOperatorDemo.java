package Operators.FilteringOperators;

import io.reactivex.rxjava3.core.Observable;

public class TakeOperatorDemo {
    public static void main(String[] args) {
        Observable<Integer> observable=Observable.fromArray(1,2,3,4,5).take(3);
        observable.subscribe(System.out::println);
    }
}
