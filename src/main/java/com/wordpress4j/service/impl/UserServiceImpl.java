package com.wordpress4j.service.impl;

import com.wordpress4j.entity.Users;
import com.wordpress4j.mapper.UsersMapper;
import com.wordpress4j.repository.UserRepository;
import com.wordpress4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author souvc
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users findById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<Users> findByIds(List<Long> ids) {
        return usersMapper.selectBatchIds(ids);
    }
}
