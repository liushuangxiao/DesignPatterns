package com.lsx.study.ProducerAndConsumer.simple;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author kebi on 2017/3/22.
 */
public class TaskScheduler {
    private static LinkedBlockingQueue<String> jobQueue;

    public static List<Thread> consumers;

    public static List<Thread> producers;

    public static Set<String> dealResults;

    public static void addJob(String job) throws InterruptedException {
        jobQueue.put(job);
    }

    public static String getOneJob() throws InterruptedException {
        return jobQueue.take();
    }

    private static void init() {
        jobQueue = new LinkedBlockingQueue<>(10000);
        consumers = new ArrayList<>();
        producers = new ArrayList<>();
        dealResults = new HashSet<>();
    }

    public synchronized static void deal(String job) {
        dealResults.add(job);
    }

    public static void main(String[] args) throws InterruptedException {

        duo();

    }

    public static void duo(){
        init();

        for (int i = 0; i < 2; i++) {
            Thread producer = new Thread(new Producer("producer-" + i));
            producers.add(producer);
            producer.start();
        }

        for (int i = 0; i < 5; i++) {
            Thread consumer = new Thread(new Consumer());
            consumers.add(consumer);
            consumer.start();
        }

        new Thread(new ThreadStatus()).start();
    }

    public static void dan() throws InterruptedException {
        for (int i = 0; i < 20000; i++) {
            System.out.println(i);
            Thread.sleep(3);
        }

        for (int i = 0; i < 20000; i++) {
            Thread.sleep(3);
            System.out.println(i);
        }


    }
}
