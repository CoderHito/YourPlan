package com.hito.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.protocol.HTTP;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.hito.baseTest.SpringTestCase;
import com.hito.utils.HttpUtil;


public class UserServiceTest extends SpringTestCase    {
//    @Autowired
//    private UserService userService;
    Logger logger = Logger.getLogger(UserServiceTest.class);

    
    
    @SuppressWarnings("deprecation")
	@Test
    public void selectUserByIdTest(){
//        User user = userService.selectUserById(10);
    	
    	String url = "http://localhost:8088/Plan/server/get";
//    	String requeststr = "1";
    	Map<String, Object> params = new HashMap<String, Object>();
    	params.put("user", "1");
		Map<String, Object> user  = HttpUtil.postMsg(url, params,HTTP.UTF_8);
    	
        logger.debug("查找结果" + user);
    }
}