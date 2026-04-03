import java.util.Scanner;

public class TugasPratikumP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Hitung IPS dan Kuota SKS ===");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();

        double totalPoin = 0, bobot;
        int totalSKS = 0, sks;
        String nilaiHuruf;

        // Proses input nilai per mata kuliah
        for (int i = 1; i <= jumlahMK; i++) {
            System.out.println("Mata Kuliah ke-" + i);
            System.out.print("Masukkan SKS: ");
            sks = input.nextInt();

            System.out.print("Masukkan Nilai (A/B/C/D/E): ");
            nilaiHuruf = input.next().toUpperCase();

            // Konversi nilai huruf ke bobot angka
            bobot = 0;
            switch (nilaiHuruf) {
                case "A": bobot = 4.0; break;
                case "B": bobot = 3.0; break;
                case "C": bobot = 2.0; break;
                case "D": bobot = 1.0; break;
                case "E": bobot = 0.0; break;
                default:
                    System.out.println("Format nilai salah, dianggap E (0).");
            }

            totalPoin += (sks * bobot);
            totalSKS += sks;
        }

        // Hitung Indeks Prestasi Semester (IPS)
        double ips = 0;
        if (totalSKS > 0) {
            ips = totalPoin / totalSKS;
        }

        // Tentukan Beban Belajar Maksimal berdasarkan tabel
        int maksSKS;
        if (ips >= 3.50) {
            maksSKS = 24;
        } else if (ips >= 3.00) { // Rentang 3.00 - 3.49
            maksSKS = 22;
        } else if (ips >= 2.00) { // Rentang 2.00 - 2.99
            maksSKS = 20;
        } else {                  // Kurang dari 2.00
            maksSKS = 18;
        }

        // Tampilkan Hasil
        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.printf("Total SKS yang diambil : %d\n", totalSKS);
        System.out.printf("IPS Anda               : %.2f\n", ips);
        System.out.println("Maksimal SKS ke depan  : " + maksSKS + " SKS");

        input.close();
    }
}