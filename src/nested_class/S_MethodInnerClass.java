// Percobaan menggunakan method local inner class

package nested_class;

class MyOuterClassDemo {

    private final int x = 1;

    // instance method of the outer class
    public void doThings() {
        final String name = "local variable";
        // inner class defined inside a method of outer class
        class MylnnerClassDemo {


            public void seeOuter() {
                System.out.println("Outer Value of x is:" + x);
                System.out.println("Value of name is :" + name);
            }
        }

        // Accessing the inner class
        MylnnerClassDemo inner = new MylnnerClassDemo();
        inner.seeOuter();
    }
}

        public class S_MethodInnerClass {
            public static void main(String[] args) {

                MyOuterClassDemo  myOuter = new MyOuterClassDemo();
                myOuter.doThings();

            }
}
