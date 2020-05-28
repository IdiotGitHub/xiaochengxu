package com.mini.service;

import com.mini.controller.view.JobView;
import com.mini.response.PageBean;

public interface JobService {
    public PageBean<JobView> getJobs(String search, Integer currentPage, Integer pageSize);

    JobView selectJobById(Integer jobId);
}
