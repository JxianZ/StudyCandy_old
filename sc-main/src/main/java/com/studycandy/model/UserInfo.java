package com.studycandy.model;

import java.util.Date;

public class UserInfo {
    private Integer id;

    private Integer userSchoolId;

    private Integer userStuId;

    private String userGender;

    private String userIdCard;

    private Integer userLv;

    private Integer userMoney;

    private Integer userIntegral;

    private Date userBirth;

    private String userMotto;

    private String userRank;

    private Date rankDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserSchoolId() {
        return userSchoolId;
    }

    public void setUserSchoolId(Integer userSchoolId) {
        this.userSchoolId = userSchoolId;
    }

    public Integer getUserStuId() {
        return userStuId;
    }

    public void setUserStuId(Integer userStuId) {
        this.userStuId = userStuId;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender == null ? null : userGender.trim();
    }

    public String getUserIdCard() {
        return userIdCard;
    }

    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard == null ? null : userIdCard.trim();
    }

    public Integer getUserLv() {
        return userLv;
    }

    public void setUserLv(Integer userLv) {
        this.userLv = userLv;
    }

    public Integer getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(Integer userMoney) {
        this.userMoney = userMoney;
    }

    public Integer getUserIntegral() {
        return userIntegral;
    }

    public void setUserIntegral(Integer userIntegral) {
        this.userIntegral = userIntegral;
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserMotto() {
        return userMotto;
    }

    public void setUserMotto(String userMotto) {
        this.userMotto = userMotto == null ? null : userMotto.trim();
    }

    public String getUserRank() {
        return userRank;
    }

    public void setUserRank(String userRank) {
        this.userRank = userRank == null ? null : userRank.trim();
    }

    public Date getRankDate() {
        return rankDate;
    }

    public void setRankDate(Date rankDate) {
        this.rankDate = rankDate;
    }
}