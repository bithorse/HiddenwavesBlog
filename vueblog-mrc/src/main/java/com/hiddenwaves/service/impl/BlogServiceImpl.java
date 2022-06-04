package com.hiddenwaves.service.impl;

import com.hiddenwaves.entity.Blog;
import com.hiddenwaves.mapper.BlogMapper;
import com.hiddenwaves.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ruichen.ma
 * @since 2022-04-21
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
