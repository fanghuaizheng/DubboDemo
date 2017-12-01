package cn.com.fhz.impl;

import cn.com.fhz.inter.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by hzfang on 2017/11/30.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public String addStr(String val1, String val2) {
        return val1+"-"+val2;
    }
}
