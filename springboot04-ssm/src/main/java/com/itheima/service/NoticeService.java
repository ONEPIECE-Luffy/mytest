/**   
* @Title: NoticeService.java 
* @Package com.itheima.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师   
* @date 2017年9月5日 上午10:49:41 
* @version V1.0   
*/
package com.itheima.service;

import java.util.List;
import java.util.Map;

import com.itheima.pojo.Notice;

/** 
* @ClassName: NoticeService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Luffy_ONEPIECE 
* @date 2017年9月5日 上午10:49:41 
*  
*/
public interface NoticeService {
	List<Notice> findAll();

	/** 
	* @Title: findByPage 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param page
	* @param rows
	* @return    设定文件 
	* @return String    返回类型 
	* @throws 
	*/
	Map<String, Object> findByPage(Integer page, Integer rows);
}
