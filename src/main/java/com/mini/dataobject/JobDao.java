package com.mini.dataobject;

import java.math.BigDecimal;
import java.util.Date;

public class JobDao {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_info.id
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_info.title
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_info.salary
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    private BigDecimal salary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_info.company
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    private String company;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_info.hr
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    private Integer hr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_info.workplace
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    private String workplace;

    private String years;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_info.education
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    private String education;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_info.requirements
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    private String requirements;

    private String benefits;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_info.datetime
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    private Date datetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_info.view_count
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    private Integer viewCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_info.interviewee
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    private String interviewee;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_info.id
     *
     * @return the value of job_info.id
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_info.id
     *
     * @param id the value for job_info.id
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_info.title
     *
     * @return the value of job_info.title
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_info.title
     *
     * @param title the value for job_info.title
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_info.salary
     *
     * @return the value of job_info.salary
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_info.salary
     *
     * @param salary the value for job_info.salary
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_info.company
     *
     * @return the value of job_info.company
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_info.company
     *
     * @param company the value for job_info.company
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_info.hr
     *
     * @return the value of job_info.hr
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public Integer getHr() {
        return hr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_info.hr
     *
     * @param hr the value for job_info.hr
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public void setHr(Integer hr) {
        this.hr = hr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_info.workplace
     *
     * @return the value of job_info.workplace
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public String getWorkplace() {
        return workplace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_info.workplace
     *
     * @param workplace the value for job_info.workplace
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_info.education
     *
     * @return the value of job_info.education
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public String getEducation() {
        return education;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_info.education
     *
     * @param education the value for job_info.education
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_info.requirements
     *
     * @return the value of job_info.requirements
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public String getRequirements() {
        return requirements;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_info.requirements
     *
     * @param requirements the value for job_info.requirements
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public void setRequirements(String requirements) {
        this.requirements = requirements == null ? null : requirements.trim();
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_info.datetime
     *
     * @return the value of job_info.datetime
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_info.datetime
     *
     * @param datetime the value for job_info.datetime
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_info.view_count
     *
     * @return the value of job_info.view_count
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_info.view_count
     *
     * @param viewCount the value for job_info.view_count
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_info.interviewee
     *
     * @return the value of job_info.interviewee
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public String getInterviewee() {
        return interviewee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_info.interviewee
     *
     * @param interviewee the value for job_info.interviewee
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    public void setInterviewee(String interviewee) {
        this.interviewee = interviewee == null ? null : interviewee.trim();
    }
}