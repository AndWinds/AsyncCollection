package com.yf.tool;


import org.junit.Test;

import java.util.ArrayList;


public class SimpleQueueTest {


    @Test
    public void testCreate(){
        SimpleQueue<String> queue = new SimpleQueue<>(10,"");
        SimpleQueue<String> queue1 = new SimpleQueue<>(10,true,"");
        SimpleQueue<String> queue2 = new SimpleQueue<>(10,true,new ArrayList<>(),"");

        queue.put("test");
        System.out.println(queue.size());
        System.out.println(queue.take());
        System.out.println(queue.size());

        queue1.put("test1");
        System.out.println(queue1.size());
        System.out.println(queue1.take());
        System.out.println(queue1.size());

        queue2.put("test2");
        System.out.println(queue2.size());
        System.out.println(queue2.take());
        System.out.println(queue2.size());
    }


}
