
package if1.pkg10118042.latihan56.umurbarangantik;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk Menunjukkan umur barang antik
 */
public class IF110118042Latihan56UmurBarangAntik {

   
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setNama("Radio AM");
        System.out.println("Nama barang antik : "+radio.getNama());
        radio.tampilUmur();
    }
    
}
