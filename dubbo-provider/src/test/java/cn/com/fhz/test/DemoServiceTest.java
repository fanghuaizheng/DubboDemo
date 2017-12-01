package cn.com.fhz.test;

import cn.com.fhz.inter.DemoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hzfang on 2017/12/1.
 */
public class DemoServiceTest extends BaseTest{

    @Autowired
    DemoService demoService;


    @Test
    public void testAddStr(){
        String addStr = demoService.addStr("123", "hello");

        System.out.println(addStr);
    }


}
