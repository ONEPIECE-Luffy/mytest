/**   
* @Title: Notice.java 
* @Package com.itheima.pojo 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师   
* @date 2017年9月5日 上午10:24:47 
* @version V1.0   
*/
package com.itheima.pojo;

import java.io.Serializable;

/** 
* @ClassName: Notice 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Luffy_ONEPIECE 
* @date 2017年9月5日 上午10:24:47 
*  
*/
public class Notice implements Serializable {
	private static final long serialVersionUID = 5679176319867604937L;
	private Long id;
	private String title;
	private String content;
	/** setter and getter method */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
