package com.shenmintech.crm;

import java.io.UnsupportedEncodingException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.google.gson.Gson;
import com.shenmintech.base.template.SpringRedisTemplate;
import com.shenmintech.cbp.ShenminKCApplication;
import com.shenmintech.cbp.biz.IRoomAndVideoBiz;
import com.shenmintech.cbp.controller.bean.res.NetEasyUserResponse;


/**
 * Created by mywu on 2016/4/21.
 */
@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ShenminKCApplication.class,initializers = ConfigFileApplicationContextInitializer.class )
@WebAppConfiguration
public class BaseTests {
	
	@Autowired
	IRoomAndVideoBiz iRoomAndVideoBiz;
	
	@Autowired
	SpringRedisTemplate springRedisTemplate;
	
	@SuppressWarnings("static-access")
	@Test
	public void teee() throws UnsupportedEncodingException{
		NetEasyUserResponse a = iRoomAndVideoBiz.createAccoutAndAccid("2", "Kate");
		NetEasyUserResponse b = iRoomAndVideoBiz.createAccoutAndAccid("3", "John");
		NetEasyUserResponse c = iRoomAndVideoBiz.createAccoutAndAccid("4", "Steven");
		NetEasyUserResponse d = iRoomAndVideoBiz.createAccoutAndAccid("5", "Mary");
		NetEasyUserResponse e = iRoomAndVideoBiz.createAccoutAndAccid("6", "Tina");
		System.out.println(new Gson().toJson(a));
		System.out.println(new Gson().toJson(b));
		System.out.println(new Gson().toJson(c));
		System.out.println(new Gson().toJson(d));
		System.out.println(new Gson().toJson(e));
		System.out.println("========");
		System.out.println("========");
		System.out.println("========");
		System.out.println("========");
		System.out.println("========");
		System.out.println("========");
		
		/*springRedisTemplate.expire("test", "1234567", 5l, TimeUnit.SECONDS);
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String str = springRedisTemplate.get("test");
			System.out.println(str);
		}*/
		
		
		
		
		
		
		
		
	}
	

}
