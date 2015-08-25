/**
 * Project Name:mvc
 * File Name:UserController.java
 * Package Name:springTest.mvc.controller
 * Date:2015年8月25日下午12:06:55
 * Copyright (c) 2015, sid Jenkins All Rights Reserved.
 * 
 *
*/
package springTest.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:UserController
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2015年8月25日 下午12:06:55 
 * @author   sid
 * @see 	 
 */
@RestController
@RequestMapping(value="/user")
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String getUser(@PathVariable String id){
		logger.info("do something!");
		return id;
	}
	
	@RequestMapping(value="/post")
	public String getUser(HttpServletRequest request,HttpServletResponse response){
		String id = ServletRequestUtils.getStringParameter(request, "id","哈哈");
		return id;
	}
}

