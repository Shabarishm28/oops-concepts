package oops2;

class One {
	  public void printOne() {
	    System.out.println("printOne() method of One class.");
	  }
	}

	class Two extends One {
	  public void printTwo() {
	    System.out.println("printTwo() method of Two class.");
	  }
	}

	public class multilevelinheritance extends Two {
		public static void main(String[] args) {
	    // Creating object of the derived class (Main)
			multilevelinheritance obj = new multilevelinheritance();

	    // Calling methods
	    obj.printOne();
	    obj.printTwo();
	  }
	}

