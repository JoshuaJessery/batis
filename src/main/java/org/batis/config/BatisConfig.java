package org.batis.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class BatisConfig {

	@Resource
	DataSource dataSource;
	
	@Bean
	public SqlSessionFactoryBean getSessionFactoryBean() {
		
		return null;
	}
}
