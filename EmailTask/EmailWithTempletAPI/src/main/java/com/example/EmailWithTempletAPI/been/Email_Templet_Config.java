package com.example.EmailWithTempletAPI.been;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Email_Templet_Config {
	
	@Id @Column
	private String id;
	
	@Column
	private String applicationName;
	
	@Column
	private String tamplateName;
	
	@Column
	private String dynamic_Mail_Body;

	public Email_Templet_Config(String id, String applicationName, String tamplateName, String dynamic_Mail_Body) {
		this.id = id;
		this.applicationName = applicationName;
		this.tamplateName = tamplateName;
		this.dynamic_Mail_Body = dynamic_Mail_Body;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getDynamic_Mail_Body() {
		return dynamic_Mail_Body;
	}

	public void setDynamic_Mail_Body(String dynamic_Mail_Body) {
		this.dynamic_Mail_Body = dynamic_Mail_Body;
	}

	@Override
	public String toString() {
		return "Email_Templet_Config{" +
				"id='" + id + '\'' +
				", applicationName='" + applicationName + '\'' +
				", tamplateName='" + tamplateName + '\'' +
				", dynamic_Mail_Body='" + dynamic_Mail_Body + '\'' +
				'}';
	}

	public Email_Templet_Config() {
	}
}
