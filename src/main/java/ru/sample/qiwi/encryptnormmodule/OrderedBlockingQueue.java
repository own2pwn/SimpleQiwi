//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

public class OrderedBlockingQueue<E> implements Runnable {
    final Map<Integer, E> orderedMap = new HashMap();
    int currentOrder = 0;
    final LinkedBlockingQueue<E> processQueue = new LinkedBlockingQueue();
    final OrderedBlockingQueue.Handler<E> processObject;
    final E stopObject;
    public final Semaphore semaphore = new Semaphore(100);

    public OrderedBlockingQueue(OrderedBlockingQueue.Handler<E> processObject, E stopObject) {
        this.processObject = processObject;
        this.stopObject = stopObject;
    }

    public synchronized void put(E object, int order) throws InterruptedException {
        if(order == -1) {
            this.processQueue.put(object);
        }

        if(this.currentOrder == order) {
            this.processQueue.put(object);
            ++this.currentOrder;

            Object future;
            do {
                future = this.orderedMap.get(Integer.valueOf(this.currentOrder));
                if(future != null) {
                    this.processQueue.put((E)future);
                    this.orderedMap.remove(Integer.valueOf(this.currentOrder));
                    ++this.currentOrder;
                }
            } while(future != null);
        } else {
            this.orderedMap.put(Integer.valueOf(order), object);
        }

    }

    public void run() {
        int processedCounter = 0;

        try {
            while(true) {
                Object e = this.processQueue.take();
                if(e == this.stopObject) {
//                    System.out.println(processedCounter + " overall objects processed...");
                    return;
                }

                this.processObject.process((E)e);
                ++processedCounter;
                if(processedCounter % '?' == 0) {
//                    System.out.println(processedCounter + " object processed...");
                }

                this.semaphore.release();
            }
        } catch (Exception var6) {
            throw new RuntimeException();
        } finally {
//            System.out.println("OrderedBlockingQueue stopped...");
        }
    }

    public interface Handler<T> {
        void process(T var1);
    }
}
