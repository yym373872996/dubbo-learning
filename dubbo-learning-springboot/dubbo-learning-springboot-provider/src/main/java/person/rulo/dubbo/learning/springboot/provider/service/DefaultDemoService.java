package person.rulo.dubbo.learning.springboot.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import person.rulo.dubbo.learning.springboot.api.DemoService;

/**
 * @Author rulo
 * @Date 2020/7/14 19:42
 */
@DubboService(version = "${demo.service.version}")
public class DefaultDemoService implements DemoService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
