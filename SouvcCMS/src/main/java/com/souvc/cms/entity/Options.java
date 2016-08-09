package com.souvc.cms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "souvc_cms_options")
public class Options {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="option_id",nullable=false,length=20)
    private Long optionId;

	@Column(name="option_name",nullable=false,length=191)
    private String optionName;

	@Column(name="autoload",nullable=false,length=191)
    private String autoload;

	@Column(name="option_value",nullable=false,length=191)
    private String optionValue;

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    public String getAutoload() {
        return autoload;
    }

    public void setAutoload(String autoload) {
        this.autoload = autoload == null ? null : autoload.trim();
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue == null ? null : optionValue.trim();
    }
}