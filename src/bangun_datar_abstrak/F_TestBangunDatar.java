/* Percobaan menjalankan kelas abstrack
pada bangun datar (ini merupakan bagian
kelas F_TestBangunDatar pada package bangun_datar_abstrak)
 */

package bangun_datar_abstrak;

public class F_TestBangunDatar {
    public static void main(String[] args) {

        // membuat objek persegi dan mengisi nilai properti
        B_Persegi persegi = new B_Persegi();
        persegi .setSisi(2);
        persegi.setColor("Biru");

        // membuat objek Lingkaran dan mengisi nilai properti
        D_Lingkaran lingkaran = new D_Lingkaran();
        lingkaran.setJariJari(22);
        lingkaran.setColor("Merah");

        // membuat objek Persegi Panjang dan mengisi nilai properti
        C_PersegiPanjang persegiPanjang = new C_PersegiPanjang();
        persegiPanjang.setPanjang(8);
        persegiPanjang.setLebar(4);
        persegiPanjang.setColor("Kuning");

        // membuat objek Segitiga dan mengisi nilai properti
        E_Segitiga mSegitiga = new E_Segitiga();
        mSegitiga.setAlas(6);
        mSegitiga.setTinggi(4);
        mSegitiga.setColor("Hijau");

        persegi.greeting();
        persegi.luas();
        persegi.keliling();
        System.out.println();

        lingkaran.luas();
        lingkaran.keliling();
        System.out.println();

        persegiPanjang.luas();
        persegiPanjang.keliling();
        System.out.println();

        mSegitiga.luas();
        mSegitiga.keliling();

    }
}
