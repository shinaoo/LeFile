package com.lefile.usermanager.entity;

public class User {

    public static int DEFAULT_LIMIT = 10;

    private long id;
    private String username;
    private String passwd;
    private int projLimit;

    public User() {
    }

    public User(String username, String passwd, int projLimit) {
        this.id = id;
        this.username = username;
        this.passwd = passwd;
        this.projLimit = projLimit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getProjLimit() {
        return projLimit;
    }

    public void setProjLimit(int projLimit) {
        this.projLimit = projLimit;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                ", projLimit=" + projLimit +
                '}';
    }
}
