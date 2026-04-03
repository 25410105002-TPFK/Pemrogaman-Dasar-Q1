import java.util.Scanner;

public class TugasPertemuan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMember = "", alamatMember = "", noHpMember = "";
        double diskonMember = 0;

        System.out.println();
        System.out.println("25410105002_Tri Prasetyo Fandy Kusuma");
        System.out.println("=== Status Membership ===");
        System.out.print("Apakah anda mau daftar Member? (Y/T): ");
        String statusMember = input.nextLine();
        
        if (statusMember.equalsIgnoreCase("y")) {
            diskonMember = 0.02; // Diskon member 2%
            
            System.out.println("--- Form Identitas Member ---");
            System.out.print("Nama Lengkap : ");
            namaMember = input.nextLine();
            System.out.print("Alamat       : ");
            alamatMember = input.nextLine();
            System.out.print("Nomor HP     : ");
            noHpMember = input.nextLine();
        }

        // Inisialisasi/Deklarasi
        String namaBarang; 
        double hargaBarang, total, totalDiskon, totalBayar, nominalDiskon, diskonBarang = 0; 
        int jumlahBarang;

        // INPUT BARANG ALFADURO 
        System.out.println("=== AlfaDuro ===");
        System.out.print("Nama Barang   : ");
        namaBarang = input.nextLine();
        
        System.out.print("Harga Barang  : Rp.");
        hargaBarang = input.nextDouble();
        
        System.out.print("Jumlah Barang : ");
        jumlahBarang = input.nextInt();
        
        // Hitung total belanja kotor
        total = hargaBarang * jumlahBarang;
        input.nextLine(); // Membersihkan buffer scanner

        // --- 3. LOGIKA PERCABANGAN DISKON BELANJA ---
        // diskon barang 10%
        if (total > 300000) {
            diskonBarang = 0.10;
        // diskon barang 5% 
        } else if (total > 100000) {
            diskonBarang = 0.05;
        }

        // --- 4. KALKULASI AKHIR ---
        totalDiskon = diskonBarang + diskonMember;
        nominalDiskon = total * totalDiskon;
        totalBayar = total - nominalDiskon;

        // --- 5. OUTPUT STRUK PEMBAYARAN ---
        System.out.println("\n========================================");
        System.out.println("           STRUK KASIR INIMARET         ");
        System.out.println("========================================");
        System.out.println("DATA MEMBER:");
        System.out.println("Nama    : " + namaMember);
        System.out.println("Alamat  : " + alamatMember);
        System.out.println("No HP   : " + noHpMember);
        System.out.println("----------------------------------------");
        System.out.println("DETAIL BELANJA:");
        System.out.println("Item    : " + namaBarang);
        System.out.println("Harga   : Rp " + hargaBarang + " x " + jumlahBarang);
        System.out.println("Subtotal: Rp " + total);
        System.out.println("----------------------------------------");
        System.out.println("Diskon Belanja : " + (diskonBarang * 100) + "%");
        System.out.println("Diskon Member  : " + (diskonMember * 100) + "%");
        System.out.println("Potongan Harga : Rp " + nominalDiskon);
        System.out.println("TOTAL BAYAR    : Rp " + totalBayar);
        System.out.println("========================================");
        System.out.println("   Terima Kasih Telah Berbelanja di Alfaduro!   ");

        input.close();
    }
}