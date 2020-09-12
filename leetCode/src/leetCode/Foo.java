package leetCode;

import java.util.concurrent.Semaphore;

class Foo {

    public Foo() {

    }

    public Semaphore first = new Semaphore(0);
    public Semaphore second = new Semaphore(0);
    public Semaphore third = new Semaphore(0);


    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        second.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        second.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        third.release();
    }

    public void third(Runnable printThird) throws InterruptedException {

        third.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}