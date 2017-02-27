package cn.rainstep.service;

import cn.rainstep.entity.School;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


/**
 * Created by Zero on 2017/2/22.
 */
public interface SchoolService {
    List<School> findAll();
    Page<School> findAll(Pageable pageable);
    Page<School> find(String keyword, Pageable pageable);
    School get(Integer id);
    void save(School school);
    void delete(Integer id);
}
