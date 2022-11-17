package earth;

public class EarthExample {

	public static void main(String[] args) {
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 포면적 : " + Earth.EARTH_SURFACE_AREA + "km^2");

		// Earth.EARTH_RADIUS = 6500; // Earth 클래스의 EARTH_RADIUS 는 상수 이므로 변경 불가
	}

}
