package com.souvc.cms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "souvc_cms_termmeta")
public class Termmeta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="meta_id",nullable=false,length=20)
    private Long metaId;

	@Column(name="term_id",length=20)
    private Long termId;

	@Column(name="meta_key",length=255)
    private String metaKey;

	@Column(name="meta_value")
    private String metaValue;

    public Long getMetaId() {
        return metaId;
    }

    public void setMetaId(Long metaId) {
        this.metaId = metaId;
    }

    public Long getTermId() {
        return termId;
    }

    public void setTermId(Long termId) {
        this.termId = termId;
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