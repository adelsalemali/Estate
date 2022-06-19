package com.adel.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.format.FormatterRegistry;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.adel.formatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.adel")

@PropertySource("classpath:jdbc.properties")
public class EstateSpringConfigration implements WebMvcConfigurer {
	    
	    @Value("${jdbc.username}")
	    private String username;
	    @Value("${jdbc.password}")
	    private String password;
	    @Value("${jdbc.url}")
	    private String url;
	    @Value("${jdbc.driverClassName}")
	    private String driverClass;
	    

	// set up my view resolver
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver ;
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("insde addFormatters method");
		registry.addFormatter(new PhoneNumberFormatter());
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
		return jdbcTemplate;
	}
	
	@Bean
	public DataSource dataSource(){
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setUrl(url);
		dataSource.setDriverClassName(driverClass);
		
		return dataSource;
	}
}
