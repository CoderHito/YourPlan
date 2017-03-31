package com.hito.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.hito.baseTest.SpringTestCase;
import com.hito.utils.HttpUtil;


public class UserServiceTest extends SpringTestCase    {
//    @Autowired
//    private UserService userService;
    Logger logger = Logger.getLogger(UserServiceTest.class);

    
    
    @Test
    public void selectUserByIdTest(){
//        User user = userService.selectUserById(10);
    	
    	String url = "http://localhost:8088/plan/server/get";
//    	String requeststr = "1";
    	Map<Object, Object> params = new HashMap<Object, Object>();
    	params.put("user", "1");
		Map<Object, Object> user  = HttpUtil.httpPost(url, params);
    	
        logger.debug("查找结果" + user);
    }

    @Test
    public void selectUserByIdTest1(){
//        User user = userService.selectUserById(10);
    	
    	String url = "http://localhost:8088/plan/server/get";
    	String requeststr = "asaa";
		String user  = HttpUtil.httpPost(url,requeststr);
    	
        logger.debug("查找结果" + user);
    }
}