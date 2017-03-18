package com.studycandy.util;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * Created by yejiaquan on 16/6/5.
 */
public class sendMail {
    public static boolean sendmail(String to_mail, String concent, String title) {
        try {
            Properties pro = new Properties();
            pro.put("mail.stmp.host", "smtp.163.com");
            pro.put("mail.stmp.host", "true");
            Session sess = Session.getInstance(pro);
            sess.setDebug(true);
            //新建一个消息对象
            MimeMessage message = new MimeMessage(sess);
            //设置发件人
            message.setFrom(new InternetAddress("yjqwxgzh2015@163.com"));
            //设置收件人
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to_mail));
            //设置主题
            message.setSubject(title);
            //设置内容
            message.setText(concent);
            //设置发送时间
            message.setSentDate(new Date());
            //发送邮件
            message.saveChanges();
            Transport transport = sess.getTransport("smtp");
            transport.connect("smtp.163.com", "yjqwxgzh2015", "yem496");
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
