package com.ifly.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ifly.dto.LoginFormDTO;
import com.ifly.dto.Result;
import com.ifly.entity.User;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *

 */
public interface IUserService extends IService<User> {


    Result sendCode(String phone,HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);
}
