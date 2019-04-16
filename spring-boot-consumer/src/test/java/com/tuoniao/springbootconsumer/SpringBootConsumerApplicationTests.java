package com.tuoniao.springbootconsumer;

import com.tuoniao.springbootconsumer.service.WeixinPayService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConsumerApplicationTests {

    @Autowired
    WeixinPayService weixinPayService;

    @Test
    public void contextLoads() {
        Map aNative = weixinPayService.createNative("20190416000001", 1+"");

        Map map = weixinPayService.queryPayStatus("20190416000001");
    }

}
