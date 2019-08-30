package com.servi.cloud.register.eureka;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaRegistryAvailableEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaServerStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EurekaEventLinstener {

    @EventListener
    public void listener(EurekaInstanceRegisteredEvent e) {
        System.out.println("EurekaInstanceRegisteredEvent：" + e.getInstanceInfo().getAppName() + " 注册成功");
    }

    @EventListener
    public void listener(EurekaInstanceCanceledEvent e) {
        System.out.println("EurekaInstanceCanceledEvent：" + e.getAppName() + " 服务下线");
    }

    @EventListener
    public void listener(EurekaRegistryAvailableEvent e) {
        System.out.println("EurekaRegistryAvailableEvent:注册中心启动");
    }

    @EventListener
    public void listener(EurekaServerStartedEvent e) {
        System.out.println("EurekaServerStartedEvent：eureka服务启动");
    }
}
