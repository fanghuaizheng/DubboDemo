package cn.com.fhz.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by hzfang on 2017/12/1.
 */
@ContextConfiguration(locations = "/META-INF/spring/spring-*.xml")
public abstract class BaseTest extends AbstractJUnit4SpringContextTests{
}
