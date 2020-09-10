package Operators.TransformOperators;

import io.reactivex.rxjava3.core.Observable;

public class MapOperatorDemo {
    public static void main(String[] args) {
        Observable<Integer>  observable=Observable.fromArray(1,2,3,4,5)
                                                  .map(integer -> integer*2);
        observable.subscribe(System.out::println);
    }
}
