package com.souvc.cms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "souvc_cms_users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID",nullable=false,length=20)
	private Long id;

	@Column(name="user_login",length=60)
	private String userLogin;

	@Column(name="user_pass",length=255)
	private String userPass;

	@Column(name="user_nicename",length=50)
	private String userNicename;

	@Column(name="user_email",length=100)
	private String userEmail;

	@Column(name="user_url",length=100)
	private String userUrl;

	@DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
	@Column(name="user_registered")
	private Date userRegistered;

	@Column(name="user_activation_key",length=255)
	private String userActivationKey;

	@Column(name="user_status",length=11)
	private Integer userStatus;

	@Column(name="display_name",length=250)
	private String displayName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin == null ? null : userLogin.trim();
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass == null ? null : userPass.trim();
	}

	public String getUserNicename() {
		return userNicename;
	}

	public void setUserNicename(String userNicename) {
		this.userNicename = userNicename == null ? null : userNicename.trim();
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail == null ? null : userEmail.trim();
	}

	public String getUserUrl() {
		return userUrl;
	}

	public void setUserUrl(String userUrl) {
		this.userUrl = userUrl == null ? null : userUrl.trim();
	}

	public Date getUserRegistered() {
		return userRegistered;
	}

	public void setUserRegistered(Date userRegistered) {
		this.userRegistered = userRegistered;
	}

	public String getUserActivationKey() {
		return userActivationKey;
	}

	public void setUserActivationKey(String userActivationKey) {
		this.userActivationKey = userActivationKey == null ? null : userActivationKey.trim();
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName == null ? null : displayName.trim();
	}
}