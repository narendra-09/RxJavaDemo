package Operators.TransformOperators;

import io.reactivex.rxjava3.core.Observable;

public class WindowOperatorDemo {
    public static void main(String[] args) {
        Observable<Observable<Integer>> observable=Observable.fromArray(1,2,3,4,5,6,7,8,9,10).window(2);
        observable.subscribe(integerObservable -> integerObservable.subscribe(integer -> {
            System.out.println(integer);
        }));
    }
}
