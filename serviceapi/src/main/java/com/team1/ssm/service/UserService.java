package com.team1.ssm.service;

import com.team1.ssm.model.UserDTo;
import com.team1.ssm.model.UserDo;

import java.util.List;

/**
 * Created by admin on 2017/4/27.
 */
public interface UserService extends BaseService<UserDTo> {
    List<UserDTo> selectByExample(UserDo example);
}
