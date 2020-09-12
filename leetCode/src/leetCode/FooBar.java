package leetCode;

import java.util.concurrent.Semaphore;

public class FooBar {

    private int n;

    private Semaphore barSer = new Semaphore(0);
    private Semaphore fooSer = new Semaphore(1);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            fooSer.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            barSer.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            barSer.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            fooSer.release();
        }
    }
}
