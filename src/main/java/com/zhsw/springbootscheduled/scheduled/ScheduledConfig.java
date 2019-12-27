package com.zhsw.springbootscheduled.scheduled;

import com.zhsw.springbootscheduled.service.MessageService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: zhengliang
 * @Description: 定时器
 * @Date: 2019/12/27 15:22
 */
@Component
public class ScheduledConfig {
    @Resource
    private MessageService messageService;

    /**
     * 每隔6秒执行一次
     */
    @Scheduled(cron="*/6 * * * * ?")
    public void fun1(){
        messageService.sendMsg();
    }

}
