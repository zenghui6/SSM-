package com.zenghui.entity;

import java.util.Date;

public class Review {
    private Integer id;

    private String content;

    private Integer uid;

    private Integer pid;

    private Date createdate;

    public Review(Integer id, String content, Integer uid, Integer pid, Date createdate) {
        this.id = id;
        this.content = content;
        this.uid = uid;
        this.pid = pid;
        this.createdate = createdate;
    }

    public Review() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}