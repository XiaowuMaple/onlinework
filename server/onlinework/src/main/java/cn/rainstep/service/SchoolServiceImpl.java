package cn.rainstep.service;

import cn.rainstep.dao.SchoolRepository;
import cn.rainstep.entity.School;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Zero on 2017/2/22.
 */
@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    @Override
    public Page<School> findAll(Pageable pageable) {
        return schoolRepository.findAll(pageable);
    }

    @Override
    public School get(Integer id) {
        return schoolRepository.getOne(id);
    }

    @Override
    public void save(School school) {
        schoolRepository.save(school);
    }

    @Override
    public void delete(Integer id) {
        schoolRepository.delete(id);
    }
}
