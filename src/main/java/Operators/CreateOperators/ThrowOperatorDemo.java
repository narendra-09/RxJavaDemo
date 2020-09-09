package Operators.CreateOperators;

import io.reactivex.rxjava3.core.Observable;

public class ThrowOperatorDemo {
    public static void main(String[] args) {
        Observable<Integer> observable=Observable.error(new Throwable("error"));
        observable.subscribe(value->{
            System.out.println(value);
        },e->{
            System.out.println(e.getLocalizedMessage());
        },()->{
            System.out.println("Completed");
        });
    }
}
