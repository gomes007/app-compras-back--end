package com.example.cursomc.services;

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

}
