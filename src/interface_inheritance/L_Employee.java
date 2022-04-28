/* Percobaan mengimplementasikan interface inheritance
(ini merupakan bagian kelas L_Employee pada
package interface_inheritance
 */

package interface_inheritance;

public class L_Employee implements K_Person {

    String firstName;
    String lastName;
    String posisi = "Programmer";

    public L_Employee() {
        this.firstName = FIRSTNAME;
        this.lastName  = LASTNAME;
    }

    public L_Employee(String firstName, String lastName, String posisi) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.posisi = posisi;
    }

    public void displayInfo() {
        System.out.println("Nama:" + firstName + "" + lastName);
        System.out.println("Posisi :   " + posisi);
    }

        public void displayDefault() {
            System.out.println("Nama dari interface :   " + getName());
    }
}
