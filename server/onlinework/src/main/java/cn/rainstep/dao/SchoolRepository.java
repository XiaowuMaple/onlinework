package cn.rainstep.dao;

import cn.rainstep.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Zero on 2017/2/22.
 */
@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {

}
