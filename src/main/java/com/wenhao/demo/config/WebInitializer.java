package com.wenhao.demo.config;

import org.springframework.beans.factory.wiring.BeanWiringInfo;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext app = new AnnotationConfigWebApplicationContext();
        app.register(MyConfig.class);
        DispatcherServlet dispatcherServlet = new DispatcherServlet(app);
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
        dispatcher.addMapping("/**");
        dispatcher.setLoadOnStartup(1);
    }
}
