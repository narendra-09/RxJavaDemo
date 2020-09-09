package Operators.CreateOperators;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class IntervalOperatorDemo {
    public static void main(String[] args) throws InterruptedException {
        Observable observable=Observable.interval(1, TimeUnit.SECONDS);
        observable.subscribe((value)->{System.out.println("Printing continues");});
        Thread.sleep(5000);
    }
}

