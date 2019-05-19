package com.wordpress4j.service;

import com.wordpress4j.entity.Users;

import java.util.List;

/**
 * @author souvc
 */
public interface UserService {

    /**
     * 查找
     * @return
     */
    Users findById(Long id);

    /**
     * 查看
     * @param ids
     * @return
     */
    List<Users> findByIds(List<Long> ids);

}
