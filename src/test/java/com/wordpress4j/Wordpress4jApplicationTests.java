package com.wordpress4j;


import com.github.wolf480pl.phpass.PHPass;
import com.wordpress4j.entity.Users;
import com.wordpress4j.mapper.UsersMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Wordpress4jApplicationTests {

   @Resource
    private UsersMapper usersMapper;

    @Test
    public void testSelect() {
        PHPass phpass = new PHPass(8);
        Users users1 = usersMapper.selectById(1);
        boolean b = phpass.CheckPassword("123456", users1.getUserPass());
        System.out.println(b);
    }

}
