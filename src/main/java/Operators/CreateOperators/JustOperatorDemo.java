package Operators.CreateOperators;

import io.reactivex.rxjava3.core.Observable;

public class JustOperatorDemo {
    public static void main(String[] args) {
        Observable<Integer> observable=Observable.just(1,2,3,4,5,6);
        observable.subscribe(System.out::println);
    }
}
