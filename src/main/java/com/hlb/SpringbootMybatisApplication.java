package com.hlb;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.hlb.mapper")  //自动生成代理
@EnableScheduling  //支持任务调度（定时）
@EnableAsync
public class SpringbootMybatisApplication {

	public static Logger logger = LoggerFactory.getLogger("sysLogger");

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
	}

}
