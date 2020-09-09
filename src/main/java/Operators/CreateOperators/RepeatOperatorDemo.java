package Operators.CreateOperators;

import io.reactivex.rxjava3.core.Observable;

public class RepeatOperatorDemo {
    public static void main(String[] args) {
        Observable<Integer> observable=Observable.fromArray(1,2,3).repeat(3);
        observable.subscribe(System.out::println);
    }
}
