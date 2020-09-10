package Operators.FilteringOperators;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;

public class LastElementOperatorDemo {
    public static void main(String[] args) {
        Maybe<Integer> observable=Observable.fromArray(1,2,3,4,5).lastElement();
        observable.subscribe(System.out::println);

    }
}
