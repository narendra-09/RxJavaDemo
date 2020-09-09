package Operators.CreateOperators;

import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;

public class FromOperatorDemo {
    public static void main(String[] args) {
        Observable<Integer> observable=Observable.fromArray(1,2,3,4,5);
        observable.subscribe(System.out::println);
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(1);ar.add(2);
        Observable<Integer> observable1=Observable.fromIterable(ar);
        observable1.subscribe(System.out::println);
    }
}
