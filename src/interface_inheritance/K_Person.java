/* Percobaan mengimplementasikan interface inheritance
(ini merupakan bagian kelas K_Person pada
package interface_inheritance
 */

package interface_inheritance;

public interface K_Person extends J_Named {

    String FIRSTNAME = "Budi";
    String LASTNAME = "Gunawan";

    @Override
    default String getName() {
        return FIRSTNAME + " " + LASTNAME;
    }
}
