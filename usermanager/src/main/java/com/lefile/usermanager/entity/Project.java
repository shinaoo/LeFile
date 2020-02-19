package com.lefile.usermanager.entity;

import sun.security.provider.MD5;

public class Project {
    private long id;
    private long creTime;
    private String projName;
    private String key;
    private long userId;

    public Project() {
    }

    public Project(String projName,long userId){
        this.creTime = System.currentTimeMillis();
        //todo 2020/2/19 md5签名
//        this.key = md5(projName);
        this.key = projName;
        this.userId = userId;
        this.projName = projName;
    }

    public Project(long id, long creTime, String key, long userId) {
        this.id = id;
        this.creTime = creTime;
        this.key = key;
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCreTime() {
        return creTime;
    }

    public void setCreTime(long creTime) {
        this.creTime = creTime;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", creTime=" + creTime +
                ", projName='" + projName + '\'' +
                ", key='" + key + '\'' +
                ", userId=" + userId +
                '}';
    }
}
