package com.wordpress4j.common;

/**
 * 评论状态（开启=open，关闭=closed）
 * @author souvc
 */

public enum SwitchEnum {

    /**
     * 私密
     */
    OPEN("open","开启"),

    /**
     * 私密
     */
    CLOSED("closed","关闭");

    /**
     * 编码
     */
    private String code;

    /**
     * 名字
     */
    private String name;

    SwitchEnum(String code, String name) {
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
