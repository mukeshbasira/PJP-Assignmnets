package phone;

import camera.Capture;
import screen.Display;
import speaker.Sound;

public class mobile {

	private Integer price;
	private String brand;
	private String name;

	private Display screen;
	private Capture camera;
	private Sound speaker;

	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Display getScreen() {
		return screen;
	}
	public void setScreen(Display screen) {
		this.screen = screen;
	}
	public Capture getCamera() {
		return camera;
	}
	public void setCamera(Capture camera) {
		this.camera = camera;
	}
	public Sound getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Sound speaker) {
		this.speaker = speaker;
	}


}
