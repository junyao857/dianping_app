package com.ifly.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ifly.entity.UserInfo;
import com.ifly.mapper.UserInfoMapper;
import com.ifly.service.IUserInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *

 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
