package Operators.CreateOperators;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class TimerOperatorDemo {
    public static void main(String[] args) throws InterruptedException {
        Observable observable=Observable.timer(5, TimeUnit.SECONDS);
        observable.subscribe(item->System.out.println("hello"));
        Thread.sleep(10000);
    }
}
