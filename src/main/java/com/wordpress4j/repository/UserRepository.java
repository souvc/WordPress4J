package com.wordpress4j.repository;

import com.wordpress4j.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author souvc
 */
public interface UserRepository extends JpaRepository<Users,Long> {

    /**
     * 根据用户名称查询
     * @param s
     * @return
     */
    Users findByUserLogin(String s);
}
