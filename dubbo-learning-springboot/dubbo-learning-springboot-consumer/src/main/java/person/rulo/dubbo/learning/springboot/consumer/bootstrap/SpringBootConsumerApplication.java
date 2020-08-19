package person.rulo.dubbo.learning.springboot.consumer.bootstrap;

import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import person.rulo.dubbo.learning.springboot.api.DemoService;

/**
 * @Author rulo
 * @Date 2020/7/14 20:56
 */
@EnableAutoConfiguration
public class SpringBootConsumerApplication {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @DubboReference(version = "${demo.service.version}")
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumerApplication.class);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> logger.info(demoService.sayHello("dubbo consumer"));
    }

}
