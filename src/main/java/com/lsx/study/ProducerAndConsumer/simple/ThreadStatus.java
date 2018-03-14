package com.lsx.study.ProducerAndConsumer.simple;

/**
 * @author kebi on 2017/3/23.
 */
public class ThreadStatus implements Runnable {

    @Override
    public void run() {
        while (true){
            for (Thread thread:TaskScheduler.consumers) {
                System.out.println(thread.getName() + "-" + thread.getState());
            }

            for (Thread thread:TaskScheduler.producers) {
                System.out.println(thread.getName() + "-" + thread.getState());
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
