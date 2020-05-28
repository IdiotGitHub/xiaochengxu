package com.mini.service.serviceImpl;

import com.mini.controller.view.JobView;
import com.mini.dao.HrDaoMapper;
import com.mini.dao.JobDaoMapper;
import com.mini.dataobject.JobDao;
import com.mini.dataobject.PageDao;
import com.mini.response.PageBean;
import com.mini.service.JobService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class JobServiceImpl implements JobService {
    @Autowired
    private JobDaoMapper jobDaoMapper;
    @Autowired
    private HrDaoMapper hrDaoMapper;

    @Override
    public PageBean<JobView> getJobs(String search, Integer currentPage, Integer pageSize) {
        PageDao pageDao = new PageDao(search, (currentPage - 1) * pageSize, pageSize);
        int count = jobDaoMapper.selectCount(pageDao);
        List<JobDao> jobDaos = jobDaoMapper.getJobs(pageDao);
        List<JobView> jobViews = new ArrayList<>();
        jobDaos.forEach(jobDao -> {
            jobViews.add(convertToJobView(jobDao));
        });
        PageBean<JobView> pageBean = new PageBean<>();
        pageBean.setCurrentPage(currentPage);
        pageBean.setPageSize(pageSize);
        pageBean.setList(jobViews);
        pageBean.setTotalCounts(count);
        pageBean.setTotalPages((int) Math.ceil((double) (count) / pageSize));
        return pageBean;
    }
    @Override
    public JobView selectJobById(Integer jobId) {
        JobDao jobDao = jobDaoMapper.selectByPrimaryKey(jobId);
        return convertToJobView(jobDao);
    }

    private JobView convertToJobView(JobDao jobDao) {
        if (jobDao == null) {
            return null;
        }
        JobView jobView = new JobView();
        BeanUtils.copyProperties(jobDao, jobView);
        jobView.setHr(hrDaoMapper.selectByPrimaryKey(jobDao.getHr()));
        jobView.setRequirements(jobDao.getRequirements().split("&&"));
        jobView.setBenefits(jobDao.getBenefits().split("&&"));
        return jobView;
    }
}
