package com.wordpress4j.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.wordpress4j.util.TableUtils;
import lombok.Data;

import javax.persistence.*;

/**
 * 定义系统角色
 *
 * @author souvc
 */
@Data
@Entity
@Table(name = TableUtils.TABLE_PREFIX + "role" + TableUtils.TABLE_SUFFIX)
@TableName(TableUtils.TABLE_PREFIX + "role" + TableUtils.TABLE_SUFFIX)
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}