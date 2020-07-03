package com.gj.utils;

import java.util.List;

public class PageUtils {
    //前台传入
    //当前页
    private Integer pageNum;

    //数据库查询得到
    //总条数
    private Integer total;
    //查询结果
    private List list;

    //计算得到
    //总页数
    private int pages;
    //上一页
    private Integer prePage;
    //下一页
    private Integer nextPage;

    @Override
    public String toString() {
        return "PageUtils{" +
                "pageNum=" + pageNum +
                ", total=" + total +
                ", list=" + list +
                ", pages=" + pages +
                ", prePage=" + prePage +
                ", nextPage=" + nextPage +
                '}';
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Integer getPrePage() {
        return prePage;
    }

    public void setPrePage(Integer prePage) {
        this.prePage = prePage;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }
}