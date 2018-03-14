package com.lsx.study.ProducerAndConsumer;

import java.util.Date;

/**
 * @author kebi on 2017/3/14.
 */
public class JobSchedulingInfo {

    public JobSchedulingInfo(JobInProgress jobInProgress) {

    }

    private int level;

    private Date time;

    private String jobId;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobSchedulingInfo job = (JobSchedulingInfo) o;

        if (level != job.level) {
            return false;
        }
        if (time != null ? !time.equals(job.time) : job.time != null) {
            return false;
        }
        return jobId != null ? jobId.equals(job.jobId) : job.jobId == null;
    }

    @Override
    public int hashCode() {
        int result = level;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (jobId != null ? jobId.hashCode() : 0);
        return result;
    }
}
