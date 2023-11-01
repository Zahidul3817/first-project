package oops.basic.inheritence;

public class Family_child extends Family_2 {

	void getNumber() {

		System.out.println("buy nubmer");
	}

	public static void main(String[] args) {
		Family_child obj = new Family_child();

		obj.getNumber();
		obj.getLeptop();
		obj.getMobie();

	}

}
