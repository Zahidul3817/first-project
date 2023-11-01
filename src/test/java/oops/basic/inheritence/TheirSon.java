package oops.basic.inheritence;

public class TheirSon extends Father_2 {

	void getCar() {
		System.out.println("TheirSon buy" + " = New Car");
	}

	public static void main(String[] args) {
		TheirSon add = new TheirSon();

		add.getCar();

		add.getHome();
		add.getLand();
	}
}
