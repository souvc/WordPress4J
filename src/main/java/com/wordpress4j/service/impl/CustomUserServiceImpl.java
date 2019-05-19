package com.wordpress4j.service.impl;

import com.wordpress4j.entity.Users;
import com.wordpress4j.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * 自定义服务类
 *
 * @author souvc
 */
@Component
public class CustomUserServiceImpl implements UserDetailsService {

    Logger logger = LoggerFactory.getLogger(CustomUserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Users user = userRepository.findByUserLogin(s);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        logger.info("s:" + s);
        logger.info("username:" + user.getUsername() + ";password:" + user.getPassword());
        return user;
    }
}