package cn.rainstep.service.interfaces;

import cn.rainstep.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Zero on 2017/2/19.
 */
public interface IUserService {
    Page<User> find(String keyword, Pageable pageable);
    User get(Integer id);
    void save(User user);
    void delete(Integer id);
    User login(String account, String password);
}
