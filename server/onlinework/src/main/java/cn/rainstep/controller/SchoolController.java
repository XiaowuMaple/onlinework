package cn.rainstep.controller;

import cn.rainstep.entity.School;
import cn.rainstep.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<School> findAll() {
        return schoolService.findAll();
    }
}
