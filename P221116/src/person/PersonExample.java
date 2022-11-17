package person;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "KyeBaek");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		p1.name = "LeeSoonsin";
//		p1.ssn = "123456-7654321";
		System.out.println(p1.name);
	}

}
