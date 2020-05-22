package phone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import screen.screenImp;

public class mobile {

	private static ApplicationContext factory;

	public static void main(String[] args) {

		factory = new ClassPathXmlApplicationContext("spring.xml");

		screenImp screen = (screenImp) factory.getBean("screen");
		System.out.println("hello world");
		System.out.println(screen.len());

	}
}
