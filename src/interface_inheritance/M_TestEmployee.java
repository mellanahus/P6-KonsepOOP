/* Percobaan menjalankan interface inheritance
(ini merupakan bagian kelas M_TestEmployee pada
package interface_inheritance
 */

package interface_inheritance;

public class M_TestEmployee {
    public static void main(String[] args) {

        L_Employee employeeA  = new L_Employee();
        employeeA.displayInfo();

        System.out.println();

        L_Employee employeeB = new L_Employee("Butet", "Sitorus", "System Analyst");
        employeeB.displayInfo();
        employeeB.displayDefault();

    }
}
