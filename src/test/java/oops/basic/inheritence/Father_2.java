package oops.basic.inheritence;

public class Father_2 extends Father {

	void getLand() {

		System.out.println("From Father 2 get " + "= Land");

	}

	public static void main(String[] args) {
		Father_2 add = new Father_2();
		add.getLand();
		add.getHome();

	}
}
