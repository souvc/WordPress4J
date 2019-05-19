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

/**
 * @author souvc
 */
@Data
@Entity
@Table(name = TableUtils.TABLE_PREFIX +"terms"+ TableUtils.TABLE_SUFFIX)
@TableName(TableUtils.TABLE_PREFIX +"terms"+ TableUtils.TABLE_SUFFIX)
public class Terms implements Serializable {

    @Id
    @TableId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "term_id", nullable = false, length = 20)
    private Long termId;

    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "slug", length = 200)
    private String slug;

    @Column(name = "term_group", length = 10)
    private Long termGroup;
}