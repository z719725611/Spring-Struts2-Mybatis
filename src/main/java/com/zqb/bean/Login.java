package com.zqb.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/10/25 0025.
 */
public class Login implements Serializable{
    private static final long serialVersionUID = 4966315533970042016L;

    private String username;
    private String userpwd;
    private Integer userid;

    public Login() {
    }

    public Login(String username, String userpwd, Integer userid) {
        this.username = username;
        this.userpwd = userpwd;
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + username + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", userid='" + userid + '\'' +
                '}';
    }
}
