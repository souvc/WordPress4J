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
@Table(name = TableUtils.TABLE_PREFIX +"usermeta"+ TableUtils.TABLE_SUFFIX)
@TableName(TableUtils.TABLE_PREFIX +"usermeta"+ TableUtils.TABLE_SUFFIX)
public class Usermeta implements Serializable {

    @Id
    @TableId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "umeta_id", nullable = false, length = 20)
    private Long umetaId;

    @Column(name = "user_id", nullable = false, length = 20)
    private Long userId;

    @Column(name = "meta_key", length = 255)
    private String metaKey;

    @Column(name = "meta_value")
    private String metaValue;
}