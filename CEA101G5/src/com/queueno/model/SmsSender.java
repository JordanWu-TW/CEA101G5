package com.queueno.model;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {

	// Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "AC344fdb90110d3ba15570f7099542490e";
    public static final String AUTH_TOKEN =
            "ff2fc999e4a136e6ff530019f3934541";
    
    public void sendSMS(String memPhone) {
    	
    	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    	
    	String sendPhone = memPhone.substring(1);
    	Message message = Message.creator
    			(new PhoneNumber("+886"+sendPhone),
    			new PhoneNumber("+14158783336"),
    			"已到叫號，請儘速請往入座！！").create();
    	System.out.println(message.getSid());
    }

//    public static void main(String[] args) {
//        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//
//        Message message = Message
//                .creator(new PhoneNumber("+886"+"0963377555"), // to
//                        new PhoneNumber("+14158783336"), // from
//                        "已到叫號，請儘速請往入座！！")
//                .create();
//
//        System.out.println(message.getSid());
//    }

}