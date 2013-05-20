package spring.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSample {
	public static void main(String[] args) {
		ApplicationContext applicationContext = null;
		applicationContext = new ClassPathXmlApplicationContext( "spring-conf.xml");
		Object bean = applicationContext.getBean("sampleBean");
		Object subBeanShare = applicationContext.getBean("sampleSubBeanShare");
		System.out.println(bean);
		System.out.println(subBeanShare);
	}
}
