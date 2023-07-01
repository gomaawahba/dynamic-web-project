package com.ahmed.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
/*
public class Mainconfig implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
		context.register(appconfig.class);
		context.setServletContext(servletContext);
      	ServletRegistration.Dynamic servlet=servletContext.addServlet("dispacher", new DispatcherServlet());
      	servlet.setLoadOnStartup(1);
	    servlet.addMapping("/");
	      context.close();
	}

}
/*AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(appconfig.class);
		context.setServletContext(servletContext);
		ServletRegistration.Dynamic servlet=servletContext.addServlet("dispacher", new DispatcherServlet());
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		context.close();*/

