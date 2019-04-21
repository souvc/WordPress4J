package com.wordpress4j.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wordpress4j.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper extends BaseMapper<Users> {

    List<Users> findByUserLogin(@Param("userLogin")String userLogin);
}
