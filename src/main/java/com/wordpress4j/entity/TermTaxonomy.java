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
@Table(name = TableUtils.TABLE_PREFIX +"term_taxonomy"+ TableUtils.TABLE_SUFFIX)
@TableName(TableUtils.TABLE_PREFIX +"term_taxonomy"+ TableUtils.TABLE_SUFFIX)
public class TermTaxonomy implements Serializable {

    @Id
    @TableId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "term_taxonomy_id", nullable = false, length = 20)
    private Long termTaxonomyId;

    @Column(name = "term_id", nullable = false, length = 20)
    private Long termId;

    @Column(name = "taxonomy", length = 32)
    private String taxonomy;

    @Column(name = "parent", length = 20)
    private Long parent;

    @Column(name = "count", length = 20)
    private Long count;

    @Column(name = "description")
    private String description;
}