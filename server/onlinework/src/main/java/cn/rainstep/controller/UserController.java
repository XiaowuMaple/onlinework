package cn.rainstep.controller;

import cn.rainstep.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Zero on 2017/2/18.
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @PostMapping("/findAll")
    public Map<String, Object> findAll() {
        return succeed(userService.findAll());
    }
}
