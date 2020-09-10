package Operators.TransformOperators;

import io.reactivex.rxjava3.core.Observable;

public class ScanOperatorDemo {
    public static void main(String[] args) {
        Observable<Integer> observable=Observable.fromArray(1,2,3,4,5,6,7,8,9,10)
                                                 .scan(((integer, integer2) -> {
                                                     int x=integer+integer2;
                                                 return x;}));
        observable.subscribe(System.out::println);
    }
}
