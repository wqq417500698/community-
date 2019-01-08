package cn.huarun.decoration.mcb.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	
	public static void main(String[] args) {
		ApplicationContext config =new ClassPathXmlApplicationContext("beans.xml");
		
		String[] names = config.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println(string);
		}
		
	}

}
