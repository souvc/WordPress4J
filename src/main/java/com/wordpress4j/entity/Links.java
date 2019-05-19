package com.wordpress4j.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wordpress4j.util.TableUtils;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author souvc
 */
@Data
@Entity
@Table(name = TableUtils.TABLE_PREFIX +"links"+ TableUtils.TABLE_SUFFIX)
@TableName(TableUtils.TABLE_PREFIX +"links"+ TableUtils.TABLE_SUFFIX)
public class Links implements Serializable {

    @Id
    @TableId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "link_id", nullable = false, length = 20)
    private Long linkId;

    @Column(name = "link_url", length = 255)
    private String linkUrl;

    @Column(name = "link_name", length = 255)
    private String linkName;

    @Column(name = "link_image", length = 255)
    private String linkImage;

    @Column(name = "link_target", length = 25)
    private String linkTarget;

    @Column(name = "link_description", length = 255)
    private String linkDescription;

    @Column(name = "link_visible", length = 20)
    private String linkVisible;

    @Column(name = "link_owner", length = 20)
    private Long linkOwner;

    @Column(name = "link_rating", length = 11)
    private Integer linkRating;

    @Column(name = "link_updated")
    private Date linkUpdated;

    @Column(name = "link_rel", length = 255)
    private String linkRel;

    @Column(name = "link_rss", length = 255)
    private String linkRss;

    @Column(name = "link_notes")
    private String linkNotes;
}