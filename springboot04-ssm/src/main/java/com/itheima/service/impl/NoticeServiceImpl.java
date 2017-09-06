/**   
* @Title: NoticeServiceImpl.java 
* @Package com.itheima.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师   
* @date 2017年9月5日 上午10:50:29 
* @version V1.0   
*/
package com.itheima.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.mapper.NoticeMapper;
import com.itheima.pojo.Notice;
import com.itheima.service.NoticeService;

/** 
* @ClassName: NoticeServiceImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Luffy_ONEPIECE 
* @date 2017年9月5日 上午10:50:29 
*  
*/
@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeMapper noticeMapper;
	/* (non-Javadoc)
	 * @see com.itheima.service.NoticeService#findAll()
	 */
	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}
	/* (non-Javadoc)
	 * @see com.itheima.service.NoticeService#findByPage(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		Long count = noticeMapper.count();
		List<Notice> list = noticeMapper.findByPage((page-1)*rows, rows);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", count);
		map.put("rows", list);
		return map;
	}

}
