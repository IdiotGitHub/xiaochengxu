package com.mini.dao;

import com.mini.dataobject.JobDao;
import com.mini.dataobject.PageDao;

import java.util.List;

public interface JobDaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    int insert(JobDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    int insertSelective(JobDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    JobDao selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    int updateByPrimaryKeySelective(JobDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    int updateByPrimaryKey(JobDao record);

    List<JobDao> getJobs(PageDao pageDao);

    int selectCount(PageDao pageDao);
}