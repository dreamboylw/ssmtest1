package com.team1.ssm.service.impl;

import com.team1.ssm.mapper.UserDoMapper;
import com.team1.ssm.model.UserDo;
import com.team1.ssm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/4/27.
 */
@Slf4j
@Service
public  class UserServiceImpl extends BaseServiceImpl<UserDo> implements UserService {

    @Autowired(required = false)
    private UserDoMapper userDoMapper;

    public List<UserDo> selectByExample(UserDo example) {
        return userDoMapper.selectByExample(example);
    }
}
