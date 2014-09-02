package arhangel.dim.concurrency;


import java.util.concurrent.locks.ReentrantLock;

public class Sync {

    final Object monitor = new Object();

    ReentrantLock lock = new ReentrantLock();

    // lock on this
    // на объекте может быть вызван только 1 sync метод
    synchronized void func1() {
        // ...
    }

    // можно держать несколько мониторов для разных операций
    void func2() {
        synchronized (monitor) {
            // ...
        }
    }

    // аналог synchronized блока
    void func3() {
        lock.lock();
        try {
            // ...
        } finally {
            lock.unlock();
        }
    }

    // lock on class object
    static synchronized void func4() {
        //
    }

}
