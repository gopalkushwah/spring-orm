package com.springorm.JavaConfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.springorm.JavaConfigDao.CourseDaoImpl;
import com.springorm.JavaConfigEntity.Course;


@Configuration
@EnableTransactionManagement
public class JavaConfig {
	
	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springorm");
		ds.setUsername("root");
		ds.setPassword("1234");
		return ds;
	}
	
	
	@Bean("sessionFactory")
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setAnnotatedClasses(Course.class);
		Properties prop = new Properties();
		prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		prop.setProperty("hibernate.show_sql", "true");
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		sessionFactory.setHibernateProperties(prop);
		return sessionFactory;
	}
	
	@Bean("hibernateTemplate")
	public HibernateTemplate getHibernateTemplate() {
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory(getSessionFactory().getObject());
		return hibernateTemplate;
	}
	
	@Bean("courseDaoImpl")
	public CourseDaoImpl getCourseDaoImpl() {
		CourseDaoImpl courseDaoImpl = new CourseDaoImpl();
		courseDaoImpl.setHibernateTemplate(getHibernateTemplate());
		return courseDaoImpl;
	}
	
	@Bean("course")
	public Course getCourse() {
		return new Course();
	}
	
	@Bean("transactionManager")
	public HibernateTransactionManager getHibernateTransactionManager() {
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(getSessionFactory().getObject());
		return hibernateTransactionManager;
	}
	
	
}
