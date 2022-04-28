/* Percobaan mengimplementasi kelas abstrack
pada bangun datar (ini merupakan bagian kelas induk
kelas A_BangunDatar pada package bangun_datar_abstrak)
 */

package bangun_datar_abstrak;

public abstract class A_BangunDatar {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double luas();

    abstract double keliling();

    protected void greeting() {
        System.out.println("Selamat  datang di bangun datar!");
    }
}
