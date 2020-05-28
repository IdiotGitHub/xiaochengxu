package com.mini.dataobject;

/**
 * Created on 2019/11/23 13:07
 *
 * @Author Xiaoxu
 * @Version 1.0
 */
public class PageDao {
    private String search;
    private Integer start;
    private Integer pageSize;

    public PageDao() {
    }

    public PageDao(String search, Integer start, Integer pageSize) {
        this.search = search;
        this.start = start;
        this.pageSize = pageSize;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
