package com.example.EmailWithTempletAPI.been;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class EmailData {
    private String recepient;
    private String mailBody;
    private String mailSubject;

    private List<String> attachments;
    private HashMap<String, String> dynamicValues;

    private String applicationName;
    private String tamplateName;

    public EmailData(String recepient, String mailBody, String mailSubject, List<String> attachments, HashMap<String, String> dynamicValues, String applicationName, String tamplateName) {
        this.recepient = recepient;
        this.mailBody = mailBody;
        this.mailSubject = mailSubject;
        this.attachments = attachments;
        this.dynamicValues = dynamicValues;
        this.applicationName = applicationName;
        this.tamplateName = tamplateName;
    }

    public EmailData() {
        super();
    }

    public String getRecepient() {
        return recepient;
    }

    public void setRecepient(String recepient) {
        this.recepient = recepient;
    }

    public String getMailBody() {
        return mailBody;
    }

    public void setMailBody(String mailBody) {
        this.mailBody = mailBody;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

    public HashMap<String, String> getDynamicValues() {
        return dynamicValues;
    }

    public void setDynamicValues(HashMap<String, String> dynamicValues) {
        this.dynamicValues = dynamicValues;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getTamplateName() {
        return tamplateName;
    }

    public void setTamplateName(String tamplateName) {
        this.tamplateName = tamplateName;
    }

    @Override
    public String toString() {
        return "EmailData{" +
                "recepient='" + recepient + '\'' +
                ", mailBody='" + mailBody + '\'' +
                ", mailSubject='" + mailSubject + '\'' +
                ", attachments=" + attachments +
                ", dynamicValues=" + dynamicValues +
                ", applicationName='" + applicationName + '\'' +
                ", tamplateName='" + tamplateName + '\'' +
                '}';
    }
}
