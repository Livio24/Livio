package com.flowable.helloworld;

import java.util.HashMap;
import java.util.Map;
import org.flowable.engine.ProcessEngine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {
	
	@Autowired
	private ProcessEngine processEngine;

	@Test
	public void variable() {
		MyMessage message = new MyMessage();
		message.setMessage("myMessage");
		
		Map<String, Object> variableMap = new HashMap<String, Object>();
		variableMap.put("message", message);
		 
		processEngine.getRuntimeService().startProcessInstanceByKey("MyProcess", variableMap);    
	}
	
}
