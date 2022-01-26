package com.example.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MokEmailService extends AbstractEmailService {
	
	
	private static final Logger LOG = LoggerFactory.getLogger(MokEmailService.class);
	

	@Override
	public void sendEmail(SimpleMailMessage msg) {
		
		LOG.info("simulando envio email...");
		LOG.info(msg.toString());
		LOG.info("email enviado");

	}


	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		LOG.info("simulando envio email HTML...");
		LOG.info(msg.toString());
		LOG.info("email enviado");
		
	}

}
