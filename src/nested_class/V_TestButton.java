/* Percobaan menjalankan anonymous inner class
(ini merupakan bagian kelas V_TestButton
pada package nested_class)
 */

package nested_class;

public class V_TestButton {
    public static void main(String[] args) {
        U_Button btn = new U_Button();

        // membuat class anonymous untuk implementasi interface
        btn.setClickAction(new T_Clickable() {
            @Override
            public void onClick() {
                System.out.println("Tombol sudah diklik!");
                System.out.println("Yay!");
            }
        });

        // mencoba klik tombol
        btn.doClick();

            }
}
