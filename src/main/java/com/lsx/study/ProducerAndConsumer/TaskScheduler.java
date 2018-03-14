package com.lsx.study.ProducerAndConsumer;

import java.util.Collections;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author kebi on 2017/3/14.
 */
public class TaskScheduler {
    private Map<JobSchedulingInfo, JobInProgress> jobInProgressQueue;

    private Queue<Long> jobQueue;

    public TaskScheduler() {
        super();
        jobInProgressQueue = new TreeMap<>(new JobSchedulingInfoComparator());
//        jobInProgressQueue = Collections.synchronizedMap(jobInProgressQueue);
        jobQueue = new LinkedBlockingQueue<>();
    }

    private void addJob(JobInProgress jobInProgress) {
        jobInProgressQueue.put(new JobSchedulingInfo(jobInProgress), jobInProgress);
    }


}