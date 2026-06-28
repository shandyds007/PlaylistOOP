package playlistoop;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){

        /*
        Group 6
        Dewa Sembiring - 2902775443
        Muhammad Dustin - 2902799613
        Shandy Diaz Saputra - 2902773551
        Stefanus Rico Pandapotan Situngkir - 2902784441
         */

        Scanner scanner = new Scanner(System.in);
        PlaylistArray playlistLagu = new PlaylistArray();

        System.out.println("\n");
        System.out.println("TUGAS ASSESTMENT 2 \n");


        // ================= MENU INTERAKTIF =================
        int pilihan;
        do {
            System.out.println("=== MENU PLAYLIST MUSIK ===");
            System.out.println("1. Tampilkan semua lagu");
            System.out.println("2. Tambah lagu baru");
            System.out.println("3. Hapus lagu berdasarkan judul");
            System.out.println("4. Cari lagu berdasarkan judul");
            System.out.println("5. Urutkan berdasarkan durasi");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Input harus berupa angka, coba lagi: ");
                scanner.next();
            }
            pilihan = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar lagu saat ini:");
                    playlistLagu.tampilkanSemuaLagu();
                    break;

                case 2:
                    System.out.print("Masukkan judul lagu : ");
                    String judulBaru = scanner.nextLine();
                    System.out.print("Masukkan artis      : ");
                    String artisBaru = scanner.nextLine();
                    System.out.print("Masukkan durasi (menit): ");
                    double durasiBaru = scanner.nextDouble();
                    scanner.nextLine();

                    playlistLagu.tambahLagu(new Lagu(judulBaru, artisBaru, durasiBaru));
                    break;

                case 3:
                    System.out.print("Masukkan judul lagu yang ingin dihapus: ");
                    String judulHapus = scanner.nextLine();
                    playlistLagu.hapusLagu(judulHapus);
                    break;

                case 4:
                    System.out.print("Masukkan judul lagu yang ingin dicari: ");
                    String judulCari = scanner.nextLine();
                    playlistLagu.cariLagu(judulCari);
                    break;

                case 5:
                    playlistLagu.urutkanLaguBerdasarkanDurasi();
                    break;

                case 6:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }

            System.out.println();

        } while (pilihan != 6);

        scanner.close();
    }
}