package cn.rainstep.dao;

import cn.rainstep.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Zero on 2017/2/19.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
