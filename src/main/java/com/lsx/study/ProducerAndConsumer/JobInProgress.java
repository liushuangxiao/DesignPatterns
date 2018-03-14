package com.lsx.study.ProducerAndConsumer;

/**
 * @author kebi on 2017/3/14.
 */
public class JobInProgress {
    private JobStatus status;

    private String jobId;

    private Thread thread;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }


    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }
}
