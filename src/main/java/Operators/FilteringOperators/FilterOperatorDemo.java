package Operators.FilteringOperators;

import io.reactivex.rxjava3.core.Observable;

public class FilterOperatorDemo {
    public static void main(String[] args) {
        Observable<Integer> observable=Observable.fromArray(1,2,3,4,5,6,7,8,9,10)
                                                 .filter(integer -> integer%2==0);//Emits even numbers
        observable.subscribe(System.out::println);
    }
}
