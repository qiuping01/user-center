package com.ping.usercenter;

import com.ping.usercenter.mapper.UserMapper;
import com.ping.usercenter.model.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest//(classes = { UserCenterApplication.class })
//@RunWith(SpringRunner.class) //使用junit的Test，启动spring
public class SampleTest {

    //@Resource默认会按照JavaBean的名称去注入
    //@Autowired //只会按照类型去注入
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null); // 传空，查所有
        //Assert.isTrue(5 == userList.size(), "");
        org.junit.Assert.assertEquals(5, userList.size());//断言：我觉得
        userList.forEach(System.out::println);
    }
}