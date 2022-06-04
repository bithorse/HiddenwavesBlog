package com.hiddenwaves.mapper;

import com.hiddenwaves.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ruichen.ma
 * @since 2022-04-21
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
