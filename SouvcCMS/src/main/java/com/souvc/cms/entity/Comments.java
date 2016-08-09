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
@Table(name = "souvc_cms_comments")
public class Comments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="comment_ID",nullable=false,length=20)
    private Long commentId;

	@Column(name="comment_post_ID",nullable=false,length=20)
    private Long commentPostId;

	@Column(name="comment_author",length=20)
    private String commentAuthor;

	@Column(name="comment_author_email",length=100)
    private String commentAuthorEmail;

	@Column(name="comment_author_url",length=200)
    private String commentAuthorUrl;

	@Column(name="comment_author_IP",length=100)
    private String commentAuthorIp;

	@DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
	@Column(name="comment_date")
    private Date commentDate;

	@DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
	@Column(name="comment_date_gmt")
    private Date commentDateGmt;

	@Column(name="comment_karma",length=11)
    private Integer commentKarma;
	
	@Column(name="comment_approved",length=20)
    private String commentApproved;

	@Column(name="comment_agent",length=255)
    private String commentAgent;

	@Column(name="comment_type",length=20)
    private String commentType;

	@Column(name="comment_parent",length=20)
    private Long commentParent;

	@Column(name="user_id",length=20)
    private Long userId;

	@Column(name="comment_content")
    private String commentContent;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getCommentPostId() {
        return commentPostId;
    }

    public void setCommentPostId(Long commentPostId) {
        this.commentPostId = commentPostId;
    }

    public String getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor == null ? null : commentAuthor.trim();
    }

    public String getCommentAuthorEmail() {
        return commentAuthorEmail;
    }

    public void setCommentAuthorEmail(String commentAuthorEmail) {
        this.commentAuthorEmail = commentAuthorEmail == null ? null : commentAuthorEmail.trim();
    }

    public String getCommentAuthorUrl() {
        return commentAuthorUrl;
    }

    public void setCommentAuthorUrl(String commentAuthorUrl) {
        this.commentAuthorUrl = commentAuthorUrl == null ? null : commentAuthorUrl.trim();
    }

    public String getCommentAuthorIp() {
        return commentAuthorIp;
    }

    public void setCommentAuthorIp(String commentAuthorIp) {
        this.commentAuthorIp = commentAuthorIp == null ? null : commentAuthorIp.trim();
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Date getCommentDateGmt() {
        return commentDateGmt;
    }

    public void setCommentDateGmt(Date commentDateGmt) {
        this.commentDateGmt = commentDateGmt;
    }

    public Integer getCommentKarma() {
        return commentKarma;
    }

    public void setCommentKarma(Integer commentKarma) {
        this.commentKarma = commentKarma;
    }

    public String getCommentApproved() {
        return commentApproved;
    }

    public void setCommentApproved(String commentApproved) {
        this.commentApproved = commentApproved == null ? null : commentApproved.trim();
    }

    public String getCommentAgent() {
        return commentAgent;
    }

    public void setCommentAgent(String commentAgent) {
        this.commentAgent = commentAgent == null ? null : commentAgent.trim();
    }

    public String getCommentType() {
        return commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType == null ? null : commentType.trim();
    }

    public Long getCommentParent() {
        return commentParent;
    }

    public void setCommentParent(Long commentParent) {
        this.commentParent = commentParent;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}