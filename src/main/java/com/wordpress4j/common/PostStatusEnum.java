package com.wordpress4j.common;

/**
 * 文章状态（发布=publish，自动草稿=auto-draft，草稿-draft,回收站=trash，待复审=pending，私密=private，版本，影响文章post_parent=inherit）
 * @author souvc
 */
public enum PostStatusEnum {
    /**
     * 发布
     */
    POST_PUBLISH("publish","发布"),

    /**
     * 自动草稿
     */
    POST_AUTO_DRAFT("auto-draft","自动草稿"),

    /**
     * 草稿
     */
    POST_TRASH("draft","草稿"),

    /**
     * 待复审
     */
    POST_PENDING("pending","待复审"),
    /**
     * 私密
     */
    POST_PRIVATED("private","私密"),

    /**
     * 私密
     */
    POST_INHERIT("inherit","其他");

    /**
     * 编码
     */
    private String code;

    /**
     * 名字
     */
    private String name;

    PostStatusEnum(String code, String name) {
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
