package com.souvc.cms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "souvc_cms_links")
public class Links {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="link_id",nullable=false,length=20)
    private Long linkId;

	@Column(name="link_url",length=255)
    private String linkUrl;

	@Column(name="link_name",length=255)
    private String linkName;

	@Column(name="link_image",length=255)
    private String linkImage;

	@Column(name="link_target",length=25)
    private String linkTarget;

	@Column(name="link_description",length=255)
    private String linkDescription;

	@Column(name="link_visible",length=20)
    private String linkVisible;

	@Column(name="link_owner",length=20)
    private Long linkOwner;

	@Column(name="link_rating",length=11)
    private Integer linkRating;

	@Column(name="link_updated")
    private Date linkUpdated;

	@Column(name="link_rel",length=255)
    private String linkRel;

	@Column(name="link_rss",length=255)
    private String linkRss;

	@Column(name="link_notes")
    private String linkNotes;

    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage == null ? null : linkImage.trim();
    }

    public String getLinkTarget() {
        return linkTarget;
    }

    public void setLinkTarget(String linkTarget) {
        this.linkTarget = linkTarget == null ? null : linkTarget.trim();
    }

    public String getLinkDescription() {
        return linkDescription;
    }

    public void setLinkDescription(String linkDescription) {
        this.linkDescription = linkDescription == null ? null : linkDescription.trim();
    }

    public String getLinkVisible() {
        return linkVisible;
    }

    public void setLinkVisible(String linkVisible) {
        this.linkVisible = linkVisible == null ? null : linkVisible.trim();
    }

    public Long getLinkOwner() {
        return linkOwner;
    }

    public void setLinkOwner(Long linkOwner) {
        this.linkOwner = linkOwner;
    }

    public Integer getLinkRating() {
        return linkRating;
    }

    public void setLinkRating(Integer linkRating) {
        this.linkRating = linkRating;
    }

    public Date getLinkUpdated() {
        return linkUpdated;
    }

    public void setLinkUpdated(Date linkUpdated) {
        this.linkUpdated = linkUpdated;
    }

    public String getLinkRel() {
        return linkRel;
    }

    public void setLinkRel(String linkRel) {
        this.linkRel = linkRel == null ? null : linkRel.trim();
    }

    public String getLinkRss() {
        return linkRss;
    }

    public void setLinkRss(String linkRss) {
        this.linkRss = linkRss == null ? null : linkRss.trim();
    }

    public String getLinkNotes() {
        return linkNotes;
    }

    public void setLinkNotes(String linkNotes) {
        this.linkNotes = linkNotes == null ? null : linkNotes.trim();
    }
}