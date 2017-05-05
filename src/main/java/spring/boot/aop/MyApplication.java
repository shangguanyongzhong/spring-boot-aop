package spring.boot.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by P0093203 on 2017/3/22.
 * 通知:
 * 前置通知
 * 后置最终通知
 * 后置返回通知
 * 后置异常通知
 * 环绕通知
 */
@SpringBootApplication
public class MyApplication  {
    public static void main(String[] args){
        SpringApplication.run(MyApplication.class,args);

    }



}