/**
 * 
 */
package com.example.learning;

import org.apache.catalina.servlets.WebdavServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author DccLxxVii
 *
 *
 */

@Configuration
public class BeanConfig {
	@Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebdavServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }


}
