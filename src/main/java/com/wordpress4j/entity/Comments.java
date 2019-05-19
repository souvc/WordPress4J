package com.wordpress4j.entity;

import java.io.Serializable;
import java.util.Date;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wordpress4j.util.TableUtils;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

/**
 * @author souvc
 */
@Data
@Entity
@Table(name = TableUtils.TABLE_PREFIX + "comment"+ TableUtils.TABLE_SUFFIX)
@TableName(TableUtils.TABLE_PREFIX + "comment"+ TableUtils.TABLE_SUFFIX)
public class Comments implements Serializable {

    @Id
    @TableId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_ID", nullable = false, length = 20)
    private Long commentId;

    @Column(name = "comment_post_ID", nullable = false, length = 20)
    private Long commentPostId;

    @Column(name = "comment_author", length = 20)
    private String commentAuthor;

    @Column(name = "comment_author_email", length = 100)
    private String commentAuthorEmail;

    @Column(name = "comment_author_url", length = 200)
    private String commentAuthorUrl;

    @Column(name = "comment_author_IP", length = 100)
    private String commentAuthorIp;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "comment_date")
    private Date commentDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "comment_date_gmt")
    private Date commentDateGmt;

    @Column(name = "comment_karma", length = 11)
    private Integer commentKarma;

    @Column(name = "comment_approved", length = 20)
    private String commentApproved;

    @Column(name = "comment_agent", length = 255)
    private String commentAgent;

    @Column(name = "comment_type", length = 20)
    private String commentType;

    @Column(name = "comment_parent", length = 20)
    private Long commentParent;

    @Column(name = "user_id", length = 20)
    private Long userId;

    @Column(name = "comment_content")
    private String commentContent;


}