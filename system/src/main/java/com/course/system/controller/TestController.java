package com.course.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
