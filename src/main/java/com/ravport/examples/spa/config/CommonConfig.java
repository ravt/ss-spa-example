package com.ravport.examples.spa.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({
	"com.ravport.examples.spa.dao",
	"com.ravport.examples.spa.service"
})
@EnableTransactionManagement
public class CommonConfig {
	
	@Autowired DataSource dataSource;
	@Autowired SessionFactory sessionFactory;

	@Bean DataSource dataSource() {
		return new EmbeddedDatabaseBuilder()
			.setType(EmbeddedDatabaseType.H2)
			.addScript("classpath:META-INF/config/sql/database.sql")
			.build();		
	}
	
	@Bean AnnotationSessionFactoryBean sessionFactory(){
		AnnotationSessionFactoryBean sessionFactory = new AnnotationSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		hibernateProperties.put("hibernate.connection.autocommit", "false");	
		sessionFactory.setHibernateProperties(hibernateProperties);
		String[] packagesToScan = {"com.ravport.examples.spa.model"};
		sessionFactory.setPackagesToScan(packagesToScan);
		return sessionFactory;
	}
	
	@Bean PlatformTransactionManager transactionManager() {
		PlatformTransactionManager retVal = new HibernateTransactionManager(sessionFactory);
		return retVal;
	}
	
}
