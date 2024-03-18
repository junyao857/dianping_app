package com.ifly.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ifly.entity.BlogComments;
import com.ifly.mapper.BlogCommentsMapper;
import com.ifly.service.IBlogCommentsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 */
@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
