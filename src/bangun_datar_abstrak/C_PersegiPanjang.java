/* Percobaan mengimplementasi kelas abstrack
pada bangun datar (ini merupakan bagian
kelas C_PersegiPanjang pada package bangun_datar_abstrak)
 */

package bangun_datar_abstrak;

public class C_PersegiPanjang extends A_BangunDatar {

    private double panjang;
    private double lebar;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    double luas() {
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
        return luas;
    }

    @Override
    double keliling() {
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang: " + keliling);
        return keliling;
    }
}
