/**   
* @Title: Application.java 
* @Package com.itheima 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师   
* @date 2017年9月5日 上午10:45:57 
* @version V1.0   
*/
package com.itheima;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
* @ClassName: Application 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Luffy_ONEPIECE 
* @date 2017年9月5日 上午10:45:57 
*  
*/
@SpringBootApplication
public class Application {

	/** 
	* @Title: main 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param args    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(Application.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}

}
