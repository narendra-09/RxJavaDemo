package Operators.FilteringOperators;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class SampleOperatorDemo {
    public static void main(String[] args) throws InterruptedException {
        Observable<Integer> observable=Observable.fromArray(1,2,3,4,5).sample(2, TimeUnit.SECONDS);
        observable.subscribe(System.out::println);
        Thread.sleep(5000);
    }
}
