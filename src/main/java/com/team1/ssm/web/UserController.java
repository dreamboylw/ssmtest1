package com.team1.ssm.web;

import com.team1.ssm.common.Response;
import com.team1.ssm.model.UserDo;
import com.team1.ssm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by admin on 2017/4/27.
 */
@Slf4j
//@RestController
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/all")
    @ResponseBody
    public Response<List<UserDo>> getUserAll(){
        return new Response<List<UserDo>>(userService.selectAll());
    }

    @GetMapping("/selectOne/{UserId}")
    public String getUserselectOne(@PathVariable("UserId") Integer userId, ModelMap map){
        UserDo userDo = new UserDo();
        userDo.setUserId(userId);
        map.put("users", userService.selectOne(userDo));
        return "hello";
    }
}
