package com.lsx.study.ProducerAndConsumer.simple;

/**
 * @author kebi on 2017/3/22.
 */
public class Producer implements Runnable{

    private String name;

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            try {
                Thread.sleep(3);
                TaskScheduler.addJob(name + "-" + i);
                System.out.println(name + "-" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
