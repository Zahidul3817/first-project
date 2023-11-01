package oops.basic.inheritence;

public class Parents_2 extends Parents_1 {

	public void getCar() {

		System.out.println("get car from family");

	}

	public static void main(String[] args) {

		Parents_2 obj = new Parents_2();

		obj.getCar();
		obj.getHome();
		obj.getLand();
	}

}
