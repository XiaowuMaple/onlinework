package cn.rainstep.controller;

import cn.rainstep.entity.User;
import cn.rainstep.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Zero on 2017/2/18.
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/find")
    public Map<String, Object> find(
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "") String keyword) throws InterruptedException {
        Pageable pageable = new PageRequest(pageNum - 1, pageSize);
        Page<User> data = userService.find(keyword, pageable);
        return succeed(data);
    }

    @RequestMapping("/get")
    public Map<String, Object> get(Integer id) {
        return succeed(userService.get(id));
    }

    @RequestMapping("/save")
    public Map<String, Object> save(User user) {
        userService.save(user);
        return succeed();
    }

    @RequestMapping("/delete")
    public Map<String, Object> delete(Integer id) {
        userService.delete(id);
        return succeed();
    }

    @RequestMapping("/login")
    public Map<String, Object> login(String account, String password) {
        User user = userService.login(account, password);
        if(user == null) {
            fail(user, "账号或密码错误");
        }
        return succeed(user);
    }
}
