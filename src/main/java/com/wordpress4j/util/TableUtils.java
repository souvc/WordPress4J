package com.wordpress4j.util;

/**
 * jpa很方便进行表前缀和后缀添加操作
 * 但是没有找到比较好的方法来写Mybatis plus 表前缀和后缀，暂时用这样的方法，后续再优化
 * @author souvc
 */
public class TableUtils {

    public static final String TABLE_PREFIX = "wp_";
    public static final String TABLE_SUFFIX = "";

}
