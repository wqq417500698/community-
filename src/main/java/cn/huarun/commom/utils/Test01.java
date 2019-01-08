package cn.huarun.commom.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		String[] names = context.getBeanDefinitionNames();
           for (String string : names) {
			System.out.println(string);
		}
	}

}
