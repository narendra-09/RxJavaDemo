package Operators.CreateOperators;

import io.reactivex.rxjava3.core.Observable;

public class RangeOperatorDemo {
    public static int start=1,count=5;
    public static void main(String[] args) {
        Observable<Integer> observable=Observable.range(start,count);
        observable.subscribe(System.out::println);
    }
}
