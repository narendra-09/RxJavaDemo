package SingleClassDemo;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.DisposableSingleObserver;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class SingleObservableTester {
    public static void main(String[] args) throws InterruptedException {
        //Create an Observable
        Single<String> testSingle=Single.just("Hey Git...");
        //Create an Observer
        Disposable disposable=testSingle
                                        .delay(2, TimeUnit.SECONDS, Schedulers.io())
                                        .subscribeWith(new DisposableSingleObserver<String>(){

                                            @Override
                                            public void onSuccess(@NonNull String s) {
                                                System.out.println(s);
                                            }

                                            @Override
                                            public void onError(@NonNull Throwable e) {
                                                e.printStackTrace();
                                            }
                                        });
        Thread.sleep(3000);
        disposable.dispose();

    }
}
