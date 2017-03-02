package cn.rainstep.service;

import cn.rainstep.dao.UserRepository;
import cn.rainstep.entity.School;
import cn.rainstep.entity.User;
import cn.rainstep.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Zero on 2017/2/19.
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public Page<User> find(String keyword, Pageable pageable) {
        keyword = "%" + keyword + "%";
        return userRepository.findByNameLikeOrMobileLike(keyword, keyword, pageable);
    }

    @Override
    public User get(Integer id) {
        return userRepository.getOne(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.delete(id);
    }


    @Override
    public User login(String account, String password) {
        return userRepository.getByAccountAndPassword(account, password);
    }
}
