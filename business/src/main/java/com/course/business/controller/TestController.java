package com.course.business.controller;

import com.course.server.domain.Test;
import com.course.server.service.TestSevice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 *  
 *  * @projectName course
 *  * @title     TestController   
 *  * @package    com.course.controller  
 *  * @description      
 *  * @author juzizhou     
 *  * @date   2020/11/30 20:36  
 *  * @version V1.0.0
 *  * @copyright 2020 www.XXXXX.com
 *  
 */

@RestController
//@RequestMapping("system")
public class TestController {
    @Resource
    private TestSevice testSevice;

    @RequestMapping("/test")
    public String test() {
        return "success";
    }

    @RequestMapping("/test1")
    public List<Test> test1() {
        return testSevice.list();
    }
    @RequestMapping("/test2")
    public List<Test> test2() {
        return testSevice.list();
    }
    @RequestMapping("/test3")
    public List<Test> test3() {
        return testSevice.list();
    }
}
