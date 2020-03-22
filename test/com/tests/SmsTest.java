package com.tests;


import java.io.File;
import java.io.IOException;

import com.service.technolite.sms.SmsDetails;
import com.service.technolite.sms.SmsService;

public class SmsTest {
	public static void main(String[] args) throws IOException {
		testSms();
	}

	public static void testSms() throws IOException {
		String filePath = "resources/technolite-dummy-sms.properties";
		File file = new File(filePath);
		SmsService smsService = new SmsService();
		smsService.load(file);
		SmsDetails smsDetails = getSmsDetails();
		smsService.sendSms(smsDetails);
	}

	public static SmsDetails getSmsDetails() {
		SmsDetails smsDetails = new SmsDetails();
		smsDetails.setMessage("Hello Sir message sent from technolite... We are successful!");
		smsDetails.setNumber("9028877194");
		return smsDetails;
	}
}
