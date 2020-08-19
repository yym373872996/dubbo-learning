package person.rulo.dubbo.learning.springboot.provider.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;


/**
 * @Author rulo
 * @Date 2020/7/10 22:19
 */
@EnableAutoConfiguration
public class SpringBootProviderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootProviderApplication.class).run(args);
    }
}
