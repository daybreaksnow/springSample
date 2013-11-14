package spring.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSample {
	public static void main(String[] args) {
		String path = "spring-conf.xml";
		if(args.length == 1){
			path = args[0];
			System.out.println("path=" + path);
		}
		ApplicationContext applicationContext = null;
		applicationContext = new ClassPathXmlApplicationContext( path);
		Object bean = applicationContext.getBean("sampleBean");
		Object subBeanShare = applicationContext.getBean("sampleSubBeanShare");
		System.out.println(bean);
		System.out.println(subBeanShare);
	}
}
