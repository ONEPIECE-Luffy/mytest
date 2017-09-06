/**   
* @Title: NoticeController.java 
* @Package com.itheima.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师   
* @date 2017年9月5日 上午10:42:04 
* @version V1.0   
*/
package com.itheima.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.pojo.Notice;
import com.itheima.service.NoticeService;

/** 
* @ClassName: NoticeController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Luffy_ONEPIECE 
* @date 2017年9月5日 上午10:42:04 
*  
*/
@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("findAll")
	@ResponseBody
	public List<Notice> findAll() {		
		List<Notice> notice = noticeService.findAll();
		return notice;		
	}
	
	@GetMapping("show")
	public String show(){
		return "html/notice.html";
	}
	
	@PostMapping("findByPage")
	@ResponseBody
	public Map<String, Object> findByPage(Integer page, Integer rows ) {
		return noticeService.findByPage(page,rows);
	}

}
