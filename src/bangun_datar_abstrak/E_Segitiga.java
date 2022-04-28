/* Percobaan mengimplementasi kelas abstrack
pada bangun datar (ini merupakan bagian
kelas E_Segitiga pada package bangun_datar_abstrak)
 */

package bangun_datar_abstrak;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class E_Segitiga extends A_BangunDatar {

    private double alas;
    private double tinggi;

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }

    @Override
    double keliling() {
        double sisiMiring  = sqrt(pow(alas/2.0,2)) + pow(tinggi,2);
        double keliling = 2 * sisiMiring + alas;
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;

    }
}
