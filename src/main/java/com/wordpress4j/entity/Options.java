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
@Table(name = TableUtils.TABLE_PREFIX +"options"+ TableUtils.TABLE_SUFFIX)
@TableName(TableUtils.TABLE_PREFIX +"options"+ TableUtils.TABLE_SUFFIX)
public class Options implements Serializable {

    @Id
    @TableId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "option_id", nullable = false, length = 20)
    private Long optionId;

    @Column(name = "option_name", nullable = false, length = 191)
    private String optionName;

    @Column(name = "autoload", nullable = false, length = 191)
    private String autoload;

    @Column(name = "option_value", nullable = false, length = 191)
    private String optionValue;
}