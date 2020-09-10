package Operators.TransformOperators;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;

import java.util.Arrays;
import java.util.List;

public class BufferOperatorDemo {
    public static void main(String[] args) {
        Observable<List<Integer>> observable=Observable.fromArray(1,2,3,4,5,6,7,8,9,10).buffer(3);
        observable.subscribe(integers -> {
            System.out.println(integers);
        });
    }
}
