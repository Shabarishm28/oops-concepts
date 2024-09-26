package oops2;

// Base class
class ParentOne {
    public void printOne() {
        System.out.println("printOne() Method of Class One");
    }
}

// Derived class 1
class childOne extends ParentOne {
    public void printTwo() {
        System.out.println("printTwo() Method of Class Two");
    }
}

// Derived class 2
class childTwo extends ParentOne {
    public void printThree() {
        System.out.println("printThree() Method of Class Three");
    }
}

// Testing Class
public class hierarchicalinheritance {
    public static void main(String[] args) {
    	childOne obj1 = new childOne();
        childTwo obj2 = new childTwo();

        // All classes can access the method of class One
        obj1.printOne();
        obj2.printOne();
    
    }
}
