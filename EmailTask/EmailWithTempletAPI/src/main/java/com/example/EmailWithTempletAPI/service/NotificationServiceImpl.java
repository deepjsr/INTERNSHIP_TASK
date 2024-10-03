package com.example.EmailWithTempletAPI.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.EmailWithTempletAPI.been.EmailData;
import com.example.EmailWithTempletAPI.been.Email_Templet_Config;
import com.example.EmailWithTempletAPI.repository.LoadMailTemplateRepository;

import jakarta.mail.internet.MimeMessage;

@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private JavaMailSender javaMailSender;

	@Value("${spring.mail.username}")
	private String sender;

	@Autowired
	private LoadMailTemplateRepository loadMailTemplateRepository ;

	@Override
	public String sendSimpleMail(EmailData emailData) {
		try {
			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
			simpleMailMessage.setFrom(sender);
			simpleMailMessage.setTo(emailData.getRecepient());
			simpleMailMessage.setText(emailData.getMailBody());
			simpleMailMessage.setSubject(emailData.getMailSubject());

			javaMailSender.send(simpleMailMessage);
			return "Successfully sent sendSimpleMail";
		} catch (Exception e) {
			return "Error in sendSimpleMail";
		}
	}

	@Override
	public String sendMailWithAttachment(EmailData emailData) {

		try {
			MimeMessage mimeMessage = javaMailSender.createMimeMessage();
			MimeMessageHelper mimeMessageHelper;

			mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

			mimeMessageHelper.setFrom(sender);
			mimeMessageHelper.setTo(emailData.getRecepient());
			mimeMessageHelper.setText(emailData.getMailBody());
			mimeMessageHelper.setSubject(emailData.getMailSubject());

			FileSystemResource fileSystemResource;

			if (emailData.getAttachments() != null && emailData.getAttachments().isEmpty()) {
				for (String filePath : emailData.getAttachments()) {
					fileSystemResource = new FileSystemResource(new File(filePath));
					mimeMessageHelper.addAttachment(fileSystemResource.getFilename(), fileSystemResource);
				}
			}

			javaMailSender.send(mimeMessage);
			return "Successfully sent sendMailWithAttachment";
		} catch (Exception e) {
			return "Error in sendMailWithAttachment";
		}
	}

	@Override
	public String sendMailWithHTML_Body(EmailData emailData) {
		try {
			MimeMessage mimeMessage = javaMailSender.createMimeMessage();
			MimeMessageHelper mimeMessageHelper;

			mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

			mimeMessageHelper.setFrom(sender);
			mimeMessageHelper.setTo(emailData.getRecepient());
			mimeMessageHelper.setText(emailData.getMailBody(), true);
			mimeMessageHelper.setSubject(emailData.getMailSubject());

			FileSystemResource fileSystemResource;

			if (emailData.getAttachments() != null && emailData.getAttachments().isEmpty()) {
				for (String filePath : emailData.getAttachments()) {
					fileSystemResource = new FileSystemResource(new File(filePath));
					mimeMessageHelper.addAttachment(fileSystemResource.getFilename(), fileSystemResource);
				}
			}

			javaMailSender.send(mimeMessage);
			return "Successfully sent sendMailWithHTML_Body";
		} catch (Exception e) {
			return "Error in sendMailWithHTML_Bodys";
		}
	}

	@Override
	public String sendMailWithDynamic_HTML_Body(EmailData emailData) {
		try {
			MimeMessage mimeMessage = javaMailSender.createMimeMessage();
			MimeMessageHelper mimeMessageHelper;

			mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

			mimeMessageHelper.setFrom(sender);
			mimeMessageHelper.setTo(emailData.getRecepient());
			mimeMessageHelper.setSubject(emailData.getMailSubject());

			List<Email_Templet_Config> email_Template_ConfigList = loadMailTemplateRepository
					.findByApplicationNameAndTamplateName(emailData.getApplicationName(), emailData.getTamplateName());

			Email_Templet_Config email_Template_Config;
			String mailTemplateBody = "";
			String keyPrefix = "#$";
			String keyPostfix = "$#";

			if (email_Template_ConfigList != null && email_Template_ConfigList.isEmpty()) {
				email_Template_Config = email_Template_ConfigList.get(0);
				mailTemplateBody = email_Template_Config.getDynamic_Mail_Body();

				String keyToMatchTemplateProperty;

				for (String key : emailData.getDynamicValues().keySet()) {
					keyToMatchTemplateProperty = keyPrefix + key + keyPostfix;

					if (mailTemplateBody.contains(keyToMatchTemplateProperty)) {
						mailTemplateBody = mailTemplateBody.replace(keyToMatchTemplateProperty,
								emailData.getDynamicValues().get(key));
					}

				}

			}

			mimeMessageHelper.setText(mailTemplateBody, true);

			FileSystemResource fileSystemResource;

			if (emailData.getAttachments() != null && emailData.getAttachments().isEmpty()) {
				for (String filePath : emailData.getAttachments()) {
					fileSystemResource = new FileSystemResource(new File(filePath));
					mimeMessageHelper.addAttachment(fileSystemResource.getFilename(), fileSystemResource);
				}
			}

			javaMailSender.send(mimeMessage);
			return "Successfully sent sendMailWithDynamic_HTML_Body";
		} catch (Exception e) {
			return "Error in sendMailWithDynamic_HTML_Body";
		}

	}


	
}