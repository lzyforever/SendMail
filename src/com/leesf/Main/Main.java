package com.leesf.Main;

import java.io.UnsupportedEncodingException;

import com.leesf.util.MailSenderInfo;
import com.leesf.util.SimpleMailSender;

public class Main {
	public static void main(String[] args) throws UnsupportedEncodingException {   
     //这个类主要是设置邮件   
     MailSenderInfo mailInfo = new MailSenderInfo();   
     //服务器端口
     mailInfo.setMailServerHost("smtp.126.com");   
     //或者是通过qq邮箱发送
     //mailInfo.setMailServerHost("smtp.qq.com");
     mailInfo.setMailServerPort("25");    
     mailInfo.setValidate(true);    
     //您的邮箱用户名
     mailInfo.setUserName("leesf456@126.com");  
     //您的邮箱密码   
     mailInfo.setPassword("lishaofeng456"); 
     //发送邮件源地址
     mailInfo.setFromAddress("leesf456@126.com");   
     //发送邮件目的地址
     mailInfo.setToAddress("490081539@qq.com");   
     //主题
     mailInfo.setSubject("设置邮箱标题 如:http://www.cnblogs.com/leesf456/ 我的博客园");  
     //内容
     mailInfo.setContent("设置邮箱内容 如:http://www.cnblogs.com/leesf456/ 我的博客园");    
     //这个类主要来发送邮件   
     SimpleMailSender sms = new SimpleMailSender();   
     sms.sendTextMail(mailInfo);//发送文体格式    
     sms.sendHtmlMail(mailInfo);//发送html格式
     sms.sendAttachMail(mailInfo);//发送带附件格式
   }  
}
