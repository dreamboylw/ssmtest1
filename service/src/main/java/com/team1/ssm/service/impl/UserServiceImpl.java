package com.team1.ssm.service.impl;

import com.team1.ssm.mapper.UserDoMapper;
import com.team1.ssm.model.UserDTo;
import com.team1.ssm.model.UserDo;
import com.team1.ssm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/4/27.
 */
@Slf4j
@Service
public  class UserServiceImpl extends BaseServiceImpl<UserDTo> implements UserService {

    @Autowired(required = false)
    private UserDoMapper userDoMapper;

    public List<UserDTo> selectByExample(UserDo example) {
        List<UserDo> userDo = userDoMapper.selectByExample(example);
        List<UserDTo> userDTos = new ArrayList<UserDTo>();
        for (UserDo userDo1 : userDo){
            UserDTo userDTo = new UserDTo();
            try {
                PropertyUtils.copyProperties(userDTo,userDo1);
            }catch (Exception e){
                log.error("MenuServiceImpl==>getMenuConvertDTO, DO转DTO异常！");
            }
            userDTos.add(userDTo);
        }
        return userDTos;
    }
}
