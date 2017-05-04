package com.team1.ssm.mapper;

import com.team1.ssm.model.UserDo;
import com.team1.ssm.util.MyMapper;

import java.util.List;

public interface UserDoMapper extends MyMapper<UserDo> {
    List<UserDo> selectByExample(UserDo example);
}