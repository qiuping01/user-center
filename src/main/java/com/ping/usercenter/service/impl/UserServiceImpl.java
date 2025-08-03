package com.ping.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ping.usercenter.model.domain.User;
import com.ping.usercenter.service.UserService;
import com.ping.usercenter.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 21877
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2025-08-03 07:46:33
 * 实现类，实现接接口的业务
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




