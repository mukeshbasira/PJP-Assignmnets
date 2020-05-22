package App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import phone.mobile;
import speaker.speakerImp;

public class app {
	private static ApplicationContext factory;

	public static void main(String[] args) {

		factory = new ClassPathXmlApplicationContext("spring.xml");

		mobile mobile = (mobile) factory.getBean("mobile");

		System.out.println("Brand -> " + mobile.getBrand());
		System.out.println("name -> " + mobile.getName());
		System.out.println("price -> " + mobile.getPrice());

		System.out.println("Megapixels -> " + mobile.getCamera().mg_pixels());
		System.out.println("screen len -> " + mobile.getScreen().len());
		System.out.println("screen bre -> " + mobile.getScreen().bre());

		System.out.println("vol -> " + mobile.getSpeaker().Vol());
		speakerImp soundnew = (speakerImp) mobile.getSpeaker();
		soundnew.setVolInteger(100);
		System.out.println("New vol -> " + mobile.getSpeaker().Vol());


	}

}
