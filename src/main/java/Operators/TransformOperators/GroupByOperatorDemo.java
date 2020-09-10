package Operators.TransformOperators;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.GroupedObservable;

public class GroupByOperatorDemo {
    public static void main(String[] args) {
        Observable<GroupedObservable<Integer,Integer>> observable=Observable.fromArray(1,2,3,4,5,6,7,8,9,10)
                                                                             .groupBy(integer -> integer);
        observable.subscribe(System.out::println);
    }
}
