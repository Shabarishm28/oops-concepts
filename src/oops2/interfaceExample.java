package oops2;

interface Animal {

	// declaration of abstract method
	void makeSound();

	void activity();
}

interface bird {

	void fly();

	void habitat();
}

class dog implements Animal, bird {

	@Override
	public void makeSound() {
		System.out.println("The dog barks");
	}

	@Override
	public void activity() {
		System.out.println("The dog runs fast");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("The birds fly");

	}

	@Override
	public void habitat() {
		// TODO Auto-generated method stub
		System.out.println("The birds migrate");
	}
}

public class interfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dog obj = new dog();
		obj.makeSound();
		obj.activity();
		obj.fly();
		obj.habitat();
	}

}
