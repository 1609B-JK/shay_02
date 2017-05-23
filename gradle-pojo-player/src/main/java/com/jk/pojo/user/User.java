package com.jk.pojo.user;

import java.io.Serializable;

/**
 * Created by apple on 2017/5/23.
 */
public class User implements Serializable {

    private int userID;

    private String userAccount;

    private String userPwd;

    private String userName;

    private int userAge;

    private int usertSex;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getUsertSex() {
        return usertSex;
    }

    public void setUsertSex(int usertSex) {
        this.usertSex = usertSex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userAccount='" + userAccount + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", usertSex=" + usertSex +
                '}';
    }
}
