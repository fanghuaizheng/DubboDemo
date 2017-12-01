package cn.com.fhz.consumer;

import cn.com.fhz.inter.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hzfang on 2017/11/30.
 */
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.addStr("hello","小辣椒"));
    }
}
