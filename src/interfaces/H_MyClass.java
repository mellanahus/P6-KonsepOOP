/* Percobaan mengimplementasikan
single interface (ini merupakan bagian kelas H_MyClass
pada package interfaces
 */

package interfaces;

public class H_MyClass implements G_MyInterface {

    @Override
    public void demo() {
        System.out.println("Nilai konstanta NUMBER dari MyInterface  = "+  NUMBER);
    }

    @Override
    public void printHello() {
        System.out.println(GREETING);
        System.out.println("printHello is abstract method from Mylnterfaces");

    }
}
