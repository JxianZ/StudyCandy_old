package com.studycandy.a2c.configuaration;

import com.studycandy.a2c.remote.RemoteService;
import com.studycandy.a2c.remote.RemoteServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/4/1
 */
@Configuration
public class RemoteServiceConfiguration {
    @Bean
    private RemoteService getRemoteService() {
        return new RemoteService();
    }

    @Bean(name = "/remoteService")
    public HttpInvokerServiceExporter remoteServiceHttpInvoker() {
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setService(getRemoteService());
        exporter.setServiceInterface(RemoteServiceInterface.class);
        return exporter;
    }
}
