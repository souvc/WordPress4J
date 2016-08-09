package com.souvc.cms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "souvc_cms_terms")
public class Terms {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="term_id",nullable=false,length=20)
    private Long termId;

	@Column(name="name",length=200)
    private String name;

	@Column(name="slug",length=200)
    private String slug;

	@Column(name="term_group",length=10)
    private Long termGroup;

    public Long getTermId() {
        return termId;
    }

    public void setTermId(Long termId) {
        this.termId = termId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug == null ? null : slug.trim();
    }

    public Long getTermGroup() {
        return termGroup;
    }

    public void setTermGroup(Long termGroup) {
        this.termGroup = termGroup;
    }
}