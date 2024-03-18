package com.ifly.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ifly.dto.Result;
import com.ifly.entity.Follow;

/**
 * <p>
 *  服务类
 * </p>
 *

 */
public interface IFollowService extends IService<Follow> {

    Result follow(Long followUserId, Boolean isFollow);

    Result isFollow(Long followUserId);

    Result followCommons(Long id);
}
