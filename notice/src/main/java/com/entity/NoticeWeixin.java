package com.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class NoticeWeixin {
    private Integer id;

    private String context;

    private Date noticeTime;

    private String userName;

    private String weixinNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getWeixinNumber() {
        return weixinNumber;
    }

    public void setWeixinNumber(String weixinNumber) {
        this.weixinNumber = weixinNumber == null ? null : weixinNumber.trim();
    }
}