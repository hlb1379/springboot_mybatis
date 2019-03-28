package com.hlb.quartz_job;

import com.hlb.SpringbootMybatisApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Fly on 2019/3/28.
 */
@Component
public class QuartzSysJob {

    @Scheduled(cron = "0/5 * * * * ?")
    public void sendEmail(){
        //定时运行，每5秒运行一次，显示系统当前时间
        SpringbootMybatisApplication.logger.error(new SimpleDateFormat("HH:mm:ss").format(new Date()));

    }

    @Async
    public void sendMsg() throws InterruptedException {
        //假设网络暂停不通，需要重复向外发送，直到发送成功才结束这个方法
        while (true) {
            Thread.sleep(1000);
            System.out.println("快点上线吧--"+ new SimpleDateFormat("HH:mm:ss").format(new Date())) ;
        }
    }
}