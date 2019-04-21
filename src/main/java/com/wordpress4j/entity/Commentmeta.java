package com.wordpress4j.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wordpress4j.util.TableUtils;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = TableUtils.TABLE_PREFIX + "commentmeta" + TableUtils.TABLE_SUFFIX)
@TableName(TableUtils.TABLE_PREFIX + "commentmeta"+ TableUtils.TABLE_SUFFIX)
public class Commentmeta implements Serializable {

    @Id
    @TableId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meta_id", nullable = false, length = 20)
    private Long metaId;

    @Column(name = "comment_id", length = 20)
    private Long commentId;

    @Column(name = "meta_key", length = 255)
    private String metaKey;

    @Column(name = "meta_value")
    private String metaValue;
}