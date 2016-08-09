package com.souvc.cms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "souvc_cms_term_taxonomy")
public class TermTaxonomy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="term_taxonomy_id",nullable=false,length=20)
    private Long termTaxonomyId;

	@Column(name="term_id",nullable=false,length=20)
    private Long termId;

	@Column(name="taxonomy",length=32)
    private String taxonomy;

	@Column(name="parent",length=20)
    private Long parent;

	@Column(name="count",length=20)
    private Long count;

	@Column(name="description")
    private String description;

    public Long getTermTaxonomyId() {
        return termTaxonomyId;
    }

    public void setTermTaxonomyId(Long termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
    }

    public Long getTermId() {
        return termId;
    }

    public void setTermId(Long termId) {
        this.termId = termId;
    }

    public String getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy == null ? null : taxonomy.trim();
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}