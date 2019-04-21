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
@Table(name = TableUtils.TABLE_PREFIX + "postmeta"+ TableUtils.TABLE_SUFFIX)
@TableName(TableUtils.TABLE_PREFIX +"postmeta"+ TableUtils.TABLE_SUFFIX)
public class Postmeta implements Serializable {

    @Id
    @TableId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meta_id", nullable = false, length = 20)
    private Long metaId;

    @Column(name = "post_id", nullable = false, length = 20)
    private Long postId;

    @Column(name = "meta_key", length = 255)
    private String metaKey;

    @Column(name = "meta_value")
    private String metaValue;
}