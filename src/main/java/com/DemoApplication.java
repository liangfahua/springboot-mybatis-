package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan("com.demo.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("DemoApplication 启动成功");
    }

}

//public class DemoApplication extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {
//
//    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
//    }
//
//    @Override
//    public void customize(ConfigurableEmbeddedServletContainer container) {
//        container.setPort(9096);
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(DemoApplication.class);
//    }
//}




