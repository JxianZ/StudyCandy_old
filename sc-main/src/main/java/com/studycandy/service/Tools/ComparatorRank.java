package com.studycandy.service.Tools;

import com.studycandy.model.UserInfo;

import java.util.Comparator;

/**
 * Created by Yxm on 2017/4/10.
 */

//用户排名的比较方法
public class ComparatorRank implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        UserInfo u1 = (UserInfo) o1;
        UserInfo u2 = (UserInfo) o2;

        int u1_point = u1.getUserIntegral()+u1.getUserMoney()*10;
        int u2_point = u2.getUserIntegral()+u2.getUserMoney()*10;

        return u1_point >= u2_point ? -1 : 1;
    }
}
