package com.souvc.cms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "souvc_cms_usermeta")
public class Usermeta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="umeta_id",nullable=false,length=20)
	private Long umetaId;

	@Column(name="user_id",nullable=false,length=20)
	private Long userId;

	@Column(name="meta_key",length=255)
	private String metaKey;

	@Column(name="meta_value")
	private String metaValue;

	public Long getUmetaId() {
		return umetaId;
	}

	public void setUmetaId(Long umetaId) {
		this.umetaId = umetaId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMetaKey() {
		return metaKey;
	}

	public void setMetaKey(String metaKey) {
		this.metaKey = metaKey == null ? null : metaKey.trim();
	}

	public String getMetaValue() {
		return metaValue;
	}

	public void setMetaValue(String metaValue) {
		this.metaValue = metaValue == null ? null : metaValue.trim();
	}
}