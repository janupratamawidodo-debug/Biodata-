import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        double angka1, angka2, hasil;

        do {
            System.out.println("\n===== KALKULATOR JAVA =====");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukkan angka pertama: ");
                angka1 = input.nextDouble();

                System.out.print("Masukkan angka kedua: ");
                angka2 = input.nextDouble();

                switch (pilihan) {
                    case 1:
                        hasil = angka1 + angka2;
                        System.out.println("Hasil = " + hasil);
                        break;

                    case 2:
                        hasil = angka1 - angka2;
                        System.out.println("Hasil = " + hasil);
                        break;

                    case 3:
                        hasil = angka1 * angka2;
                        System.out.println("Hasil = " + hasil);
                        break;

                    case 4:
                        if (angka2 == 0) {
                            System.out.println("Error: Tidak bisa membagi dengan 0!");
                        } else {
                            hasil = angka1 / angka2;
                            System.out.println("Hasil = " + hasil);
                        }
                        break;
                }
            } else if (pilihan == 5) {
                System.out.println("Program kalkulator selesai.");
            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}
