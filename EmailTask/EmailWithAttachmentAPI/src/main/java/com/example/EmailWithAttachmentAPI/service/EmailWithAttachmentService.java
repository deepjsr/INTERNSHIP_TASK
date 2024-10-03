package com.example.EmailWithAttachmentAPI.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailWithAttachmentService {

    @Autowired
    private JavaMailSender mailSender;

    /**
     * Sends an email with an attachment.
     *
     * @param to          Recipient's email address
     * @param subject     Subject of the email
     * @param body        Body of the email
     * @param file  File to attach
     */
    public void sendEmailWithAttachment(String to, String subject, String body, MultipartFile attachment) {
        try {
            // Create a MimeMessage
            MimeMessage mimeMessage = mailSender.createMimeMessage();

            // Use MimeMessageHelper to set up the message
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

            helper.setFrom("ajsxx67@gmail.com"); // You can also externalize this
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(body, true); // true indicates HTML content

            // Add the attachment if it's present
            if (attachment != null && !attachment.isEmpty()) {
                helper.addAttachment(attachment.getOriginalFilename(), attachment);
            }

            // Send the email
            mailSender.send(mimeMessage);

            System.out.println("Email sent successfully with attachment!");

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error while sending email: " + e.getMessage());
        }
    }
}


