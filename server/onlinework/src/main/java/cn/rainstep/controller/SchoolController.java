package cn.rainstep.controller;

import cn.rainstep.entity.School;
import cn.rainstep.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Zero on 2017/2/21.
 */
@RestController
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping("/findAll")
    public Page<School> findAll(@RequestParam(defaultValue = "1") Integer pageNum,
                                  @RequestParam(defaultValue = "10") Integer pageSize) {
        System.out.println(pageNum);
        Pageable pageable = new PageRequest(pageNum - 1, pageSize);
        Page<School> data = schoolService.findAll(pageable);
        return data;
    }

    @PostMapping("/get")
    public School get(Integer id) {
        return schoolService.get(id);
    }

    @PostMapping("/save")
    public void save(School school) {
        schoolService.save(school);
    }

    @PostMapping("/delete")
    public void delete(Integer id) {
        schoolService.delete(id);
    }
}
