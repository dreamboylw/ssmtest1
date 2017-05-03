package com.team1.ssm.util;

import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by admin on 2017/4/26.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T>, IdsMapper<T> {

}
