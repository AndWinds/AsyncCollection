package com.yf.tool;


import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;


public class SimpleQueueTest {


    @Test
    public void testCreate(){
        SimpleQueue<String> queue = new SimpleQueue<>(10);
        queue.put("test");
        System.out.println(queue.size());
        System.out.println(queue.take());
        System.out.println(queue.size());
    }


}
