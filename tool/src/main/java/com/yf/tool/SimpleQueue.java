package com.yf.tool;

import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;


public class SimpleQueue<T> extends ArrayBlockingQueue<T> {


    public SimpleQueue(int capacity) {
        super(capacity);
    }

    public SimpleQueue(int capacity, boolean fair) {
        super(capacity, fair);
    }

    public SimpleQueue(int capacity, boolean fair, Collection<T> c) {
        super(capacity, fair, c);
    }

    @Override
    public void put(T t) {
        try {
            super.put(t);
        } catch (InterruptedException e) {
            //   e.printStackTrace();
        }
    }

    @Override
    public T take() {
        try {
            return super.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
