package com.course.business.controller.admin;

import com.course.server.dto.ChapterDto;
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
@RequestMapping("admin")
public class ChapterController {
    @Resource
    private ChapterSevice chapterSevice;

    @RequestMapping("/chapter")
    public List<ChapterDto> chapter() {
        return chapterSevice.list();
    }

}
