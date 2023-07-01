package com.ahmed.config;
/*
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import com.ahmed.DAO.StudentDAO;
import com.ahmed.models.StudentDAOImpl;

import com.ahmed.DAO.StudentDAO;
@Configuration
@EnableWebMvc
@ComponentScan("com.ahmed")
public class appconfig implements WebMvcConfigurer{
	@Autowired
	ApplicationContext applicationcontext;
	@Bean
public	ViewResolver viewresolver() {
		
	InternalResourceViewResolver ivr=new InternalResourceViewResolver();
			ivr.setPrefix("/WEB-INF/views/");
			ivr.setSuffix(".jsp");
			ivr.setOrder(0);
			return ivr;
	}
	@Bean
	DriverManagerDataSource gDataSource() {
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost/gomaa");
		datasource.setUsername("root");
		datasource.setPassword("");
		return datasource;
	}
	@Bean
	public StudentDAO getUserDAO() {
		return StudentDAOImpl( gDataSource());
	}
	@Bean
	private StudentDAO StudentDAOImpl(DriverManagerDataSource gDataSource) {
		// TODO Auto-generated method stub
		return StudentDAOImpl( gDataSource());
	}

}
*/