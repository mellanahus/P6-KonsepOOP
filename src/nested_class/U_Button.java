/* Percobaan membuat anonymous inner class
(ini merupakan bagian kelas U_Button
pada package nested_class)
 */

package nested_class;

public class U_Button {

    private T_Clickable action;

    void setClickAction(T_Clickable action) {
        this.action = action;
    }

    void doClick() {
        action.onClick();

    }
}
