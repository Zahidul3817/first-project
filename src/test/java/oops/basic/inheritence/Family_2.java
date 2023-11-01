package oops.basic.inheritence;

public class Family_2 extends family_1 {

	void getMobie() {

		System.out.println("i get mobile from family  = Mobile");

	}

	public static void main(String[] args) {
		Family_2 obj = new Family_2();
		obj.getMobie();
		obj.getLeptop();
	}

}
