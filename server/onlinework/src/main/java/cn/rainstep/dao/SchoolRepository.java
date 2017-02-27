package cn.rainstep.dao;

import cn.rainstep.entity.School;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by Zero on 2017/2/22.
 */
@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {
    List<School> findByName(String name);
    Page<School> findByNameLikeOrAddressLike(String name, String address, Pageable pageable);
}
