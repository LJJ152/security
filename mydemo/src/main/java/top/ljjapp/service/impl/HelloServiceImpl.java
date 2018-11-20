/**
 * 
 */
package top.ljjapp.service.impl;

import org.springframework.stereotype.Service;
import top.ljjapp.service.HelloService;


/**
 * @author zhailiang
 *
 */
@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String greeting(String name) {
		System.out.println("greeting");
		return "hello "+name;
	}

}
