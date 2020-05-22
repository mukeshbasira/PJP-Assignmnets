package camera;

public class cameraImp implements Capture {
	private Integer mp_pixels;
	private Double ap;
	private Boolean OIS;

	public Integer mg_pixels() {
		return mp_pixels;
	}

	public void setMp_pixels(Integer mp_pixels) {
		this.mp_pixels = mp_pixels;
	}

	public Boolean OIS() {
		return OIS;
	}

	public void setOIS(Boolean oIS) {
		OIS = oIS;
	}

	public Double ap() {
		return ap;
	}

	public void setAp(Double ap) {
		this.ap = ap;
	}

}
