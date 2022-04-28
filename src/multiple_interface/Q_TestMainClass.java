/* Percobaan menjalankan multiple interface
(ini merupakan bagian kelas Q_TestMainClass
pada package multiple_interface)
 */

package multiple_interface;

public class Q_TestMainClass {
    public static void main(String[] args) {

        P_MainClass  mainClass  = new P_MainClass();
        mainClass.printHello();
        System.out.println("Nilai dobel dari NUMBER pada Firstlnterface = " + mainClass.doubleNumberA());
        System.out.println("Nilai dobel dari NUMBER pada Secondlnterface  = " + mainClass.doubleNumberB());

    }
}
