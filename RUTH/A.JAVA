public class A {
    public void display() {
        System.out.println("I am R from class A");
    }
}

class B extends A {
    public void print() {
        System.out.println("I am R from class B");
    }
    class multipleInheritance{
    public static void main(String[] args) {
        B objB = new B();
        objB.display();
        objB.print();
    }
}
}