package com.lsx.study.ProducerAndConsumer.simple;

import static com.lsx.study.NumberUtils.random100;

/**
 * @author kebi on 2017/3/22.
 */
public class Consumer implements Runnable {


    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(random100());
                String job = TaskScheduler.getOneJob();
                TaskScheduler.deal(job);
                System.out.println("consumer-" + job + "   " + TaskScheduler.dealResults.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
