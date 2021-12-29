package org.but.feec.bds_project3.api;

import java.util.Arrays;

public class PersonCreateView {

    private String email;
    private String givenName;
    private String nickname;
    private String familyName;
    private String status;
    private char[] pwd;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public char[] getPwd() {
        return pwd;
    }

    public void setPwd(char[] pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "PersonCreateView{" +
                "email='" + email + '\'' +
                ", givenName='" + givenName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", familyName='" + familyName + '\'' +
                ", status='" + status + '\'' +
                ", pwd=" + Arrays.toString(pwd) +
                '}';
    }
}
