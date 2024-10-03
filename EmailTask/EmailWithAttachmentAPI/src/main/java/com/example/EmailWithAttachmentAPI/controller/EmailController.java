package com.example.EmailWithAttachmentAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.EmailWithAttachmentAPI.service.EmailWithAttachmentService;

@RestController
@RequestMapping("/api")
public class EmailController {

	@Autowired
	private EmailWithAttachmentService emailWithAttachmentService;

	/**
	 * Endpoint to send an email with an attachment.
	 *
	 * @param to         Recipient's email address
	 * @param subject    Subject of the email
	 * @param body       Body of the email (e.g., Welcome Message or OTP)
	 * @param attachment File to attach
	 * @return 
	 * @return ResponseEntity with status
	 */
	@RequestMapping("/welcome")
	public String welcme() {
		return "welcome to server";
	}

	@PostMapping("/send-email")

	public ResponseEntity<String> sendEmail(@RequestParam("to") String to, @RequestParam("body")String body, @RequestParam("subject") String subject,@RequestPart(value = "attachment", required = false) MultipartFile attachment) {
		try {
			emailWithAttachmentService.sendEmailWithAttachment(to, subject,
					body, attachment);
			return ResponseEntity.ok("Email sent successfully.");
		} catch (Exception e) {
			// Log the exception (omitted for brevity)
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error sending email: " + e.getMessage());
		}
	}
}
