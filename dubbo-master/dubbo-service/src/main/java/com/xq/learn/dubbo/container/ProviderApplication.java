package com.xq.learn.dubbo.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xiaoqiang
 * @date 2019/10/31 0:01
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.xq.learn.dubbo")
public class ProviderApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
