package com.wordpress4j.common;

/**
 *  文章分类
 * @author souvc
 */

public enum CategoryEnum {

    /**
     * 文章
     */
    category("category","文章"),

    /**
     * 版本
     */
    REVISION("post","版本"),

    /**
     * 页面
     */
    tag("tag","页面");

    /**
     * 编码
     */
    private String code;

    /**
     * 名字
     */
    private String name;

    CategoryEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
