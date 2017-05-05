package com.team1.ssm.mapper;

import com.team1.ssm.model.UserDTo;
import com.team1.ssm.model.UserDo;
import com.team1.ssm.util.MyMapper;

import java.util.List;

public interface UserDoMapper extends MyMapper<UserDTo> {
    List<UserDo> selectByExample(UserDo example);
}