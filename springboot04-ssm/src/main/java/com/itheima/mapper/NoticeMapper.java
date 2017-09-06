/**   
* @Title: NoticeMapper.java 
* @Package com.itheima.mapper 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师   
* @date 2017年9月5日 上午10:19:05 
* @version V1.0   
*/
package com.itheima.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.itheima.pojo.Notice;

/** 
* @ClassName: NoticeMapper 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Luffy_ONEPIECE 
* @date 2017年9月5日 上午10:19:05 
*  
*/
@Mapper
public interface NoticeMapper {
	@Select("select * from notice")
	List<Notice> findAll();
	
	Long count();

	/**
	 * @return  
	* @Title: findByPage 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param i
	* @param rows    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	List<Notice> findByPage(@Param("page")Integer page, @Param("rows")Integer rows);
	
	
}
