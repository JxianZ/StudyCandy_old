package com.studycandy.service;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/4/5 0005.
 */
@Service
public class FileService {
    //设置好账号的ACCESS_KEY和SECRET_KEY
    final String ACCESS_KEY = "phLWNM4gmu64cJXi6yjeAqXEK2fBZnvAWhe1jZWo";
    final String SECRET_KEY = "Gj5uASxSTR_4q2e0q_kP0tOGALjJzgdx7MJfvB2F";
    //对应要上传到七牛上路径前缀
    final String PREFIX_NAME = "studycandy";

    //密钥配置
    final Auth AUTH = Auth.create(ACCESS_KEY, SECRET_KEY);
    //创建上传对象
    UploadManager uploadManager = new UploadManager();

    //用户头像上传
    public void uploadUserIcon(File file, String spaceName, Integer userId) throws IOException {
        String bucketname = PREFIX_NAME+spaceName;
        String suffix = file.getName().split(".")[file.getName().split(".").length-1];
        String key = userId+"Icon."+suffix;
        String token = AUTH.uploadToken(bucketname);
        try {
            //上传文件
            Response res = uploadManager.put(file, key, token);
            //打印返回的信息
            System.out.println(res.bodyString());
        } catch (QiniuException e) {
            Response r = e.response;
            // 请求失败时打印的异常的信息
            System.out.println(r.toString());
            try {
                //响应的文本信息
                System.out.println(r.bodyString());
            } catch (QiniuException e1) {
                //ignore
            }
        }
    }
}
