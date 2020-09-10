package Operators.FilteringOperators;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class FirstOperatorDemo {
    public static void main(String[] args) {
        Single<Integer> observable=Observable.fromArray(1,2,3,4,5,6).first(1);
        observable.subscribe(System.out::println);
    }
}
