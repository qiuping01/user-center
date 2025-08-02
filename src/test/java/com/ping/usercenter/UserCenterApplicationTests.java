package com.ping.usercenter;

import com.ping.usercenter.mapper.UserMapper;
import com.ping.usercenter.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class UserCenterApplicationTests {

    @Resource
    private UserMapper userMapper; //注入useMapper

    @Test
    void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null); // 传空，查所有
        //Assert.isTrue(5 == userList.size(), "");
        org.junit.Assert.assertEquals(5, userList.size());//断言：我觉得
        userList.forEach(System.out::println);
    }

}
