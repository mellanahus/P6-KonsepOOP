// Percobaan membuat inner class

package nested_class;

class OuterClass {

    int x = 10;
    private final int myAdd = 12;

    class InnerClass {

        int y = 5 + myAdd;
    }
}


public class R_MyMainClass {
    public static void main(String[] args) {

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass mylnner = myOuter.new InnerClass();
        System.out.println(mylnner.y +  myOuter.x);

    }
}
