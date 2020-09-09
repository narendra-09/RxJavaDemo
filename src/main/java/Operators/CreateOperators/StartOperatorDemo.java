package Operators.CreateOperators;

import io.reactivex.rxjava3.core.Observable;

public class StartOperatorDemo {
    public static void main(String[] args) {
        Observable<Integer> observable=Observable.fromArray(1,2,3,4,5).startWithItem(3);
        observable.subscribe(System.out::println);
    }
}
