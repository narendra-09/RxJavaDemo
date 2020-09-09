package Operators.CreateOperators;

import io.reactivex.rxjava3.core.Observable;

public class NeverOperatorDemo {
    public static void main(String[] args) {
        //Returns an Observable that never sends any items or notifications to an Observer.
        Observable<Integer> observable=Observable.never();
        observable.subscribe(value->{
            System.out.println(value);
        },e->{
            e.printStackTrace();
        },()->{
            System.out.println("Completed");
        });
    }
}
