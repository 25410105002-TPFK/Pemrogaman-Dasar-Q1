import java.util.Scanner;

public class TugasPertemuan2 {
    public static void main(String[] args) {
        // Inisialisasi Scanner
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("25410105002_Tri Prasetyo Fandy Kusuma");
        System.out.println("===== APLIKASI PENJUALAN TOKO SMART =====");
        
        // Input Nama Barang
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = input.nextLine();

        // Input Harga Barang
        System.out.print("Masukkan Harga Barang: ");
        int hargaBarang = input.nextInt();

        // Input Jumlah Beli
        System.out.print("Masukkan Jumlah Beli: ");
        int jumlahBeli = input.nextInt();

        // 4. Proses Perhitungan Total
        int totalBayar = hargaBarang * jumlahBeli;

        // 5. Output Hasil
        System.out.println("\n--- Ringkasan Belanja ---");
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Satuan : Rp." + hargaBarang);
        System.out.println("Jumlah Beli  : " + jumlahBeli);
        System.out.println("-------------------------");
        System.out.println("TOTAL BAYAR  : Rp." + totalBayar);
        System.out.println("-------------------------");
        System.out.println("Terima kasih telah berbelanja di Toko Smart!");
        
        input.close();
    }
}