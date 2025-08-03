package com.ping.usercenter.service;
import java.util.Date;

import com.ping.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/*
 *用户测试
 *
 * @author ping
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("dogPing");
        user.setUserAccount("123");
        user.setAvatarUrl("https://thirdwx.qlogo.cn/mmopen/vi_32/PiajxSqBRaEL4u74UegRhnTfElKHHGQ7fzRSHoWZDHJO5dczRWslDbVSG125BMxnlwX075wTWosNVzzsy6IQsmaXGnicj9SnU6yds9dKSg3WsQtCClia7f1Cg/132");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("456");
        user.setEmail("123");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        assertTrue(result);
    }

}