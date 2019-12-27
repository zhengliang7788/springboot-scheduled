package com.zhsw.springbootscheduled.service;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author: zhengliang
 * @Description: 消息服务类
 * @Date: 2019/12/27 15:23
 */
@Service
public class MessageService {
    public void  sendMsg(){
        System.out.println("现在时间"+new Date());
    }
}
