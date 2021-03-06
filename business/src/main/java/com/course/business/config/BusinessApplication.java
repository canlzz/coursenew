package com.course.business.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

/**
 *  
 *  * @projectName course
 *  * @title     BusinessApplication   
 *  * @package    com.course  
 *  * @description      
 *  * @author juzizhou     
 *  * @date   2020/11/30 20:31  
 *  * @version V1.0.0
 *  * @copyright 2020 www.XXXXX.com
 *  
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.course")
@MapperScan("com.course.server.mapper")
public class BusinessApplication {
    private static final Logger LOG = LoggerFactory.getLogger(BusinessApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BusinessApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("Business地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
