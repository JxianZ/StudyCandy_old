package com.studycandy.a2c.configuaration;

import com.studycandy.a2c.remote.RemoteService;
import com.studycandy.a2c.remote.RemoteServiceInterface;
import com.studycandy.a2c.service.AuthorizationService;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private SessionDAO sessionDAO;
    @Autowired
    private AuthorizationService authorizationService;

    @Bean
    public RemoteService getRemoteService() {
        final RemoteService remoteService = new RemoteService(authorizationService, sessionDAO, appService);
        return remoteService;
    }

    @Bean(name = "/remoteService")
    public HttpInvokerServiceExporter remoteServiceHttpInvoker() {
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setService(getRemoteService());
        exporter.setServiceInterface(RemoteServiceInterface.class);
        return exporter;
    }
}
