package org.example.demo.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan(basePackages = "org.example.demo")
public class SpringConfig {
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sessionFactoryBean=new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource());
		sessionFactoryBean.setHibernateProperties(getHibernateProperties());
		sessionFactoryBean.setPackagesToScan(new String[] {"org.example.demo.model"});
		return sessionFactoryBean;
	}
	@Bean
	public DataSource dataSource()
	{
		ComboPooledDataSource comboPooledDataSource=
				new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/hr");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("root");
		comboPooledDataSource.setMaxIdleTime(3000);
		comboPooledDataSource.setMinPoolSize(5);
		comboPooledDataSource.setMaxPoolSize(20);
		return comboPooledDataSource;
	}
	
	
	private Properties getHibernateProperties()
	{
		 return new Properties() {
	            {
	                setProperty("hibernate.hbm2ddl.auto", "update");
	                setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	                setProperty("hibernate.show_sql", "true");
	            }
	        };
	}

}
