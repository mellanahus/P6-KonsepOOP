/* Percobaan mengimplementasi kelas abstrack
pada bangun datar (ini merupakan bagian
kelas D_Lingkaran pada package bangun_datar_abstrak)
 */

package bangun_datar_abstrak;

public class D_Lingkaran extends A_BangunDatar {

    private double jariJari;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double luas() {
        double luas =Math.PI * jariJari * jariJari;
        System.out.println("Luas Lingkaran:" + luas);
        return luas;
    }

    @Override
    double keliling() {
        double  keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling Lingkaran: " + keliling);
        return keliling;
    }
}
