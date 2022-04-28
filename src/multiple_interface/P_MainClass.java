/* Percobaan mengimplementasikan multiple interface
(ini merupakan bagian kelas P_MainClass
pada package multiple_interface)
 */

package multiple_interface;

public class P_MainClass implements N_FirstInterface, O_SecondInterface {

    @Override
    public void printHello() {
        System.out.println("Nilai konstantan NUMBER di FirstInterface  = " + N_FirstInterface.NUMBER);
        System.out.println("Nilai konstantan NUMBER di SecondInterface  = " + O_SecondInterface.NUMBER);
    }

    @Override
    public int doubleNumberA() {
         return N_FirstInterface.NUMBER * 2;
        }

    @Override
    public int doubleNumberB() {
        return O_SecondInterface.NUMBER * 2;
    }
}