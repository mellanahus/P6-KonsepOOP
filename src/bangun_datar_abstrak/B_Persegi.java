/* Percobaan mengimplementasi kelas abstrack
pada bangun datar (ini merupakan bagian
kelas B_Persegi pada package bangun_datar_abstrak)
 */

package bangun_datar_abstrak;

public class B_Persegi extends A_BangunDatar {

    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }

    @Override
    public double keliling() {
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;

    }
}