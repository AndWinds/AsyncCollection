package com.yf.tool;

import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;


public class SimpleQueue<T> extends ArrayBlockingQueue<T> {

    private final T rejectValue;

    public SimpleQueue(int capacity,T rejectValue) {
        super(capacity);
        this.rejectValue = rejectValue;
    }

    public SimpleQueue(int capacity, boolean fair,T rejectValue) {
        super(capacity, fair);
        this.rejectValue = rejectValue;
    }

    public SimpleQueue(int capacity, boolean fair, Collection<T> c,T rejectValue) {
        super(capacity, fair, c);
        this.rejectValue = rejectValue;
    }

    @Override
    public void put(T t) {
        try {
            super.put(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public T take() {
        try {
            return super.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return rejectValue;
    }
}
