package oops.basic.inheritence;

public class SingleLevel__2 extends Single_Level__1 {

	public void getCar() {

		System.out.println("perents car");

	}

	public void gethome() {
		System.out.println("gethome from perents ");
	}

	public void name() {

		System.out.println("getName from family");

	}

	public static void main(String[] args) {

		SingleLevel__2 me = new SingleLevel__2();

		me.getCar();
		me.gethome();
		me.name();
	}

}
