// Percobaan mengakses variabel di anonymous inner class

package nested_class;

public class W_TestButton2 {

    // membuat variabel di dalam class
    static String title= "Tutorial Anonymous Class";

    public static void main(String[] args) {

        // membuat variabel di dalam method main
        String name = "Rekayasa  Perangkat  Lunak";
        U_Button btn = new U_Button();

        // membuat class anonymous untuk implementasi interface
        btn.setClickAction(new  T_Clickable() {
            // membuat variabel di dalam class anonymous
            String message = "belajar Anonymous  Class di Java";

            @Override
            public void onClick() {
                System.out.println("Tombol sudah diklik!");
                System.out.println("Yay!");
                // mengakses variabel
                System.out.println("Hello " + name);
                System.out.println(title);
                System.out.println(message);
            }
        });

        // mencoba klik tombol
        btn.doClick();

    }
}
