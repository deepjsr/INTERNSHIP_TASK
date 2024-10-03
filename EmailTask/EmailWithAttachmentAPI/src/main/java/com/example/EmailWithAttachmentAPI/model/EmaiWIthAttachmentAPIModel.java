package com.example.EmailWithAttachmentAPI.model;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public class EmaiWIthAttachmentAPIModel {
	private String to;
	private String subject;
	private String message;
	private File attachment;
	public EmaiWIthAttachmentAPIModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmaiWIthAttachmentAPIModel(String to, String subject, String message, File attachment) {
		super();
		this.to = to;
		this.subject = subject;
		this.message = message;
		this.attachment = attachment;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public MultipartFile getAttachment() {
		return (MultipartFile) attachment;
	}
	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}
	@Override
	public String toString() {
		return "EmaiWIthAttachmentAPIModel [to=" + to + ", subject=" + subject + ", message=" + message
				+ ", attachment=" + attachment + "]";
	}
	
	
}
