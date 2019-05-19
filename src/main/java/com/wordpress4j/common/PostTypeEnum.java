package com.wordpress4j.common;

/**
 * 文章类型（post,page,revision）
 */
public enum PostTypeEnum {


    /**
     * 文章
     */
    POST("post","文章"),

    /**
     * 版本
     */
    REVISION("revision","版本"),

    /**
     * 页面
     */
    PAGE("page","页面");

    /**
     * 编码
     */
    private String code;

    /**
     * 名字
     */
    private String name;

    PostTypeEnum(String code, String name) {
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
