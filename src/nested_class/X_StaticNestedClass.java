// Percobaan menggunakan static nested class

package nested_class;

class Outer { // outer class

    int myVar = 2;
    static int staticVar = 90;

    static class Nested { // static nested class

        void printHello() {
            System.out.println("Hello  Static Nested Class");
            System.out.println("staticVar = " + staticVar);
        }
    }
}

public class X_StaticNestedClass {
    public static void main(String[] args) {
        // use both class names
        Outer.Nested  staticClass  = new Outer.Nested();
        staticClass.printHello();

        Outer outer= new Outer();
        System.out.println("myVar = " + outer.myVar);

    }

}
