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
@Table(name = "souvc_cms_posts")
public class Posts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID",nullable=false,length=20)
    private Long id;

	@Column(name="post_author",nullable=false,length=20)
    private Long postAuthor;

	@DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
	@Column(name="post_date")
    private Date postDate;

	@DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
	@Column(name="post_date_gmt")
    private Date postDateGmt;

	@Column(name="post_status")
    private String postStatus;

	@Column(name="comment_status")
    private String commentStatus;

	@Column(name="ping_status")
    private String pingStatus;

	@Column(name="post_password")
    private String postPassword;

	@Column(name="post_name")
    private String postName;

	@DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
	@Column(name="post_modified")
    private Date postModified;

	@DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
	@Column(name="post_modified_gmt")
    private Date postModifiedGmt;

	@Column(name="post_parent",length=20)
    private Long postParent;

	@Column(name="guid",length=255)
    private String guid;

	@Column(name="menu_order",length=255)
    private Integer menuOrder;

	@Column(name="post_type",length=20)
    private String postType;

	@Column(name="post_mime_type",length=100)
    private String postMimeType;

	@Column(name="comment_count",length=20)
    private Long commentCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(Long postAuthor) {
        this.postAuthor = postAuthor;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public Date getPostDateGmt() {
        return postDateGmt;
    }

    public void setPostDateGmt(Date postDateGmt) {
        this.postDateGmt = postDateGmt;
    }

    public String getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus == null ? null : postStatus.trim();
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus == null ? null : commentStatus.trim();
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus == null ? null : pingStatus.trim();
    }

    public String getPostPassword() {
        return postPassword;
    }

    public void setPostPassword(String postPassword) {
        this.postPassword = postPassword == null ? null : postPassword.trim();
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    public Date getPostModified() {
        return postModified;
    }

    public void setPostModified(Date postModified) {
        this.postModified = postModified;
    }

    public Date getPostModifiedGmt() {
        return postModifiedGmt;
    }

    public void setPostModifiedGmt(Date postModifiedGmt) {
        this.postModifiedGmt = postModifiedGmt;
    }

    public Long getPostParent() {
        return postParent;
    }

    public void setPostParent(Long postParent) {
        this.postParent = postParent;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType == null ? null : postType.trim();
    }

    public String getPostMimeType() {
        return postMimeType;
    }

    public void setPostMimeType(String postMimeType) {
        this.postMimeType = postMimeType == null ? null : postMimeType.trim();
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }
}