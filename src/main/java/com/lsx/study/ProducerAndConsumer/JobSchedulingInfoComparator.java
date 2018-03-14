package com.lsx.study.ProducerAndConsumer;

import java.util.Comparator;

/**
 * @author kebi on 2017/3/14.
 */
public class JobSchedulingInfoComparator implements Comparator<JobSchedulingInfo> {
    @Override
    public int compare(JobSchedulingInfo o1, JobSchedulingInfo o2) {
        if (o1.getLevel() > o2.getLevel()){
            return 1;
        }else if(o1.getLevel() == o2.getLevel()){
            return o1.getTime().compareTo(o2.getTime());
        }else{
            return -1;
        }
    }
}
