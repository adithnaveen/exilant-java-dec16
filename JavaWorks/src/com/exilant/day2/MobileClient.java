package com.exilant.day2;

public class MobileClient {
	public static void main(String[] args) {
		Camera camera = new Camera();
		
		camera.setMegaPixel(5);
		camera.setLens("CARLZEIS");
		camera.setMake("SONY");
		
		Mobile mobile = new Mobile();
		mobile.setImei(10101010);
		mobile.setVolLevls(10);
		mobile.setCamera(camera);
		
		System.out.println("Mobile IMEI :" + mobile.getImei());
		System.out.println("Vol Levels :" + mobile.getVolLevls());
		System.out.println("Camera Lens : " + mobile.getCamera().getLens());
		System.out.println("Camera Mega Pixel :" + mobile.getCamera().getMegaPixel());
		System.out.println("Camera Make :" + mobile.getCamera().getMake());
	}
}
