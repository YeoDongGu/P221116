package overloading1;

public class Car {
	String model;
	int speed;

	Car(String model) {
		this.model = model;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속 :" + this.speed + "km/h)");
		}
	}

	public static void main(String[] args) {
		Car car1 = new Car("Hyundai");
		Car car2 = new Car("BMW");

		car1.run();
		car2.run();
	}

}
