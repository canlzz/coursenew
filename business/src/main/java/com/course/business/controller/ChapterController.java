package com.course.business.controller;

import com.course.server.domain.Chapter;
import com.course.server.service.ChapterSevice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 *  
 *  * @projectName course
 *  * @title     ChapterController   
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
public class ChapterController {
    @Resource
    private ChapterSevice chapterSevice;

    @RequestMapping("/chapter")
    public String chapter() {
        return "success";
    }

    @RequestMapping("/chapter1")
    public List<Chapter> chapter1() {
        return chapterSevice.list();
    }
    @RequestMapping("/chapter2")
    public List<Chapter> chapter2() {
        return chapterSevice.list();
    }
    @RequestMapping("/chapter3")
    public List<Chapter> chapter3() {
        return chapterSevice.list();
    }
}
