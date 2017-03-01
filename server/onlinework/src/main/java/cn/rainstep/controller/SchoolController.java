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


import java.util.Map;


/**
 * Created by Zero on 2017/2/21.
 */
@RestController
@RequestMapping("/school")
public class SchoolController extends BaseController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping("/find")
    public Map<String, Object> find(
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "") String keyword) throws InterruptedException {
        Pageable pageable = new PageRequest(pageNum - 1, pageSize);
        Page<School> data = schoolService.find(keyword, pageable);
        return succeed(data);
    }

    @PostMapping("/get")
    public Map<String, Object> get(Integer id) {
        return succeed(schoolService.get(id));
    }

    @PostMapping("/save")
    public Map<String, Object> save(School school) {
        schoolService.save(school);
        return succeed();
    }

    @PostMapping("/delete")
    public Map<String, Object> delete(Integer id) {
        schoolService.delete(id);
        return succeed();
    }
}
