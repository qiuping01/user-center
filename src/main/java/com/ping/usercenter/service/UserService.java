package com.ping.usercenter.service;

import com.ping.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 21877
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-08-03 07:46:33
 * 业务接口，只定义方法不去实现
 *
 * 用户服务
 *
 * @author ping
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword,
                      String checkPassword);
}
















