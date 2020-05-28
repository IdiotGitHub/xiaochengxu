package com.mini.controller.view;

import com.mini.dataobject.HrDao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class JobView {

    private Integer id;

    private String title;

    private BigDecimal salary;

    private String company;

    private HrDao hr;

    private String workplace;

    private String years;

    private String education;

    private String[] requirements;

    private String[] benefits;

    private Date datetime;

    private Integer viewCount;

    private String interviewee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public HrDao getHr() {
        return hr;
    }

    public void setHr(HrDao hr) {
        this.hr = hr;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getEducation() {
        return education;
    }


    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String[] getRequirements() {
        return requirements;
    }

    public void setRequirements(String[] requirements) {
        this.requirements = requirements;
    }

    public String[] getBenefits() {
        return benefits;
    }

    public void setBenefits(String[] benefits) {
        this.benefits = benefits;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public String getInterviewee() {
        return interviewee;
    }

    public void setInterviewee(String interviewee) {
        this.interviewee = interviewee == null ? null : interviewee.trim();
    }
}
