package pertemuan5new;

/**
 *
 * Nama : Tiara Aulia Maharani
 * NIM  : 23215039
 * TEKNIK INFORMATIKA
 * Latihan 19 Saldo Tabungan
 */
public class latihan19 {
    public static void main(String[] args) {
        double saldoAwal = 2500000;
        double bunga = 0.15;
        int lama = 6;

        System.out.println("Saldo Tabungan:");
        for (int i = 1; i <= lama; i++) {
            saldoAwal += saldoAwal * bunga;
            System.out.printf("Saldo di bulan ke-%d: Rp %.2f%n", i, saldoAwal);
        }
    }
}

    

