package Operators.CreateOperators;

import io.reactivex.rxjava3.core.Observable;

public class EmptyOperatorDemo {
    public static void main(String[] args) {
        Observable<Integer> observable=Observable.empty();
        observable.subscribe(value->{
            System.out.println(value);
        },e->{
            e.printStackTrace();
        },()->{
            System.out.println("Completed");
        });
    }
}
