package com.course.system.service;

import com.course.system.domain.Test;
import com.course.system.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *  
 *  * @projectName course
 *  * @title     TestMapper   
 *  * @package    com.course.system.mapper  
 *  * @description      
 *  * @author juzizhou     
 *  * @date   2020/12/1 6:23  
 *  * @version V1.0.0
 *  * @copyright 2020 www.XXXXX.com
 *  
 */
@Service
public class TestSevice {
    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }


}
