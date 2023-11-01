package oops.basic.inheritence;

public class Parents_1 {

	public void getLand() {

		System.out.println("getLands from parents1 :" + "getLand");
	}

	void getHome() {

		System.out.println("getHome from parents1 :" + "getHome");
	}

	public static void main(String[] args) {

		Parents_1 obj = new Parents_1();
		obj.getHome();
		obj.getLand();

	}
}
