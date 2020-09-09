package MaybeClassDemo;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.DisposableMaybeObserver;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class MaybeObservableTester {
    public static void main(String[] args) throws InterruptedException {
        //Create Observable
        Maybe<String> testMayBe=Maybe.just("Hello Git...From MayBe");
        //Create Observer
        Disposable disposable=testMayBe.
                delay(2, TimeUnit.SECONDS, Schedulers.io())
                .subscribeWith(new DisposableMaybeObserver<String>(){

                    @Override
                    public void onSuccess(@NonNull String s) {
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
                });
        Thread.sleep(3000);
        //Start Observing
        disposable.dispose();

    }
}
