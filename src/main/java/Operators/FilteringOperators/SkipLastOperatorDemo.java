package Operators.FilteringOperators;

import io.reactivex.rxjava3.core.Observable;

public class SkipLastOperatorDemo {
    public static void main(String[] args) {
        Observable<Integer> observable=Observable.fromArray(1,2,3,4,5).skipLast(2);
        observable.subscribe(System.out::println);
    }
}
