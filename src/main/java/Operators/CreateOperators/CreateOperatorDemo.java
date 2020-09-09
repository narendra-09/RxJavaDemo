package Operators.CreateOperators;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class CreateOperatorDemo {
    public static void main(String[] args) {
        //Create Operator lets you create an Observable from Scratch by Means Of a Function
        /*
         You can create an Observable from scratch by using the Create operator.
         You pass this operator a function that accepts the observer as its parameter.
         Write this function so that it behaves as an Observable —
             by calling the observer’s onNext, onError, and onCompleted methods appropriately.

A well-formed finite Observable must attempt to call either the observer’s onCompleted method exactly once or its onError
 method exactly once, and must not thereafter attempt to call any of the observer’s other methods.
         */

        //Creating Observable using create() operator

        Observable<String> observable=Observable.create(emitter -> {
          emitter.onNext("Hello Git...This is Create Operator ");
            emitter.onNext("Hello Git...This is Create Operator ");
          emitter.onComplete();
        });

        //Create an Observer
        Observer<String> observer=new Observer<>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull String s) {
                System.out.println(s);
            }

            @Override
            public void onError(@NonNull Throwable e) {
               e.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("Completed");
            }
        };

        //Start Observing
        observable.subscribe(observer);
    }
}
