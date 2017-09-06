/**   
* @Title: DataSourceConfigure.java 
* @Package com.itheima.dataSource 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师   
* @date 2017年9月5日 上午10:26:11 
* @version V1.0   
*/
package com.itheima.dataSource;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/** 
* @ClassName: DataSourceConfigure 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Luffy_ONEPIECE 
* @date 2017年9月5日 上午10:26:11 
*  
*/
@Configuration
public class DataSourceConfigure {
	@Bean("dataSource")
	@Primary
	@ConfigurationProperties(prefix="spring.datasource.c3p0")
	public DataSource getDataSource() {
		System.out.println("=========DataSourceConfiguration=========");
		return DataSourceBuilder
				.create()
				.type(ComboPooledDataSource.class)
				.build();
	}
}
