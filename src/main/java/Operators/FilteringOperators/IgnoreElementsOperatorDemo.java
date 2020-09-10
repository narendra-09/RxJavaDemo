package Operators.FilteringOperators;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Action;

public class IgnoreElementsOperatorDemo {
    public static void main(String[] args) {
        Completable observable=Observable.fromArray(1,2,3,4,5).ignoreElements();
        observable.subscribe(() -> System.out.println("Completed"));

    }
}
