package playlistoop;


/*
    Group 6
    Dewa Sembiring - 2902775443
    Muhammad Dustin - 2902799613
    Shandy Diaz Saputra - 2902773551
    Stefanus Rico Pandapotan Situngkir - 2902784441
 */

public class PlaylistArray {

    private Lagu[] playlist = new Lagu[10];
    private int jumlahLagu = 0;


    public PlaylistArray(Lagu[] lagu){
        jumlahLagu = lagu.length;
        for(int i = 0; i < lagu.length; i++){
            playlist[i] = lagu[i];
        }
    }

    public PlaylistArray(){

    }

    // TRAVERSAL
    // Menelusuri seluruh elemen array dari awal sampai akhir untuk ditampilkan.
    // Kompleksitas waktu: O(n) -> setiap lagu dikunjungi tepat satu kali.
    public void tampilkanSemuaLagu(){
        if (jumlahLagu == 0) {
            System.out.println("Playlist masih kosong.");
            return;
        }
        for(int i = 0; i < jumlahLagu; i++){
            System.out.println(playlist[i].tampilkanInfo() + "\n");
            
        }
    }

    // INSERTION
    // Menambahkan lagu baru ke akhir array, dengan pengecekan kapasitas terlebih dahulu.
    // Kompleksitas waktu: O(1) -> tidak perlu menggeser elemen lain, langsung ditaruh di akhir.
    public void tambahLagu(Lagu lagu){
        if(jumlahLagu < playlist.length){
            playlist[jumlahLagu] = lagu;
            jumlahLagu++;
            System.out.println("Lagu Berhasil Ditambahkan ke Playlist");
        }
        else{
            System.out.print("Lagu sudah Full\n");
        }
    }

    // DELETION
    // Mencari index lagu lewat judul (linear search), lalu menggeser semua elemen
    // setelah index tersebut satu posisi ke kiri agar array tetap rapat (tidak ada celah).
    // Kompleksitas waktu: O(n) -> pencarian index O(n) + pergeseran elemen O(n).
    public void hapusLagu(String judul) {
        int index = -1;

        for (int i = 0; i < jumlahLagu; i++) {
            if (playlist[i].getJudul().equalsIgnoreCase(judul)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Lagu dengan judul \"" + judul + "\" tidak ditemukan.");
            return;
        }

        // geser semua elemen setelah index satu posisi ke kiri
        for (int i = index; i < jumlahLagu - 1; i++) {
            playlist[i] = playlist[i + 1];
        }

        playlist[jumlahLagu - 1] = null; // kosongkan slot terakhir yang sudah tidak terpakai
        jumlahLagu--;

        System.out.println("Lagu \"" + judul + "\" berhasil dihapus.");
    }

    // SEARCHING
    // Mencari lagu berdasarkan judul menggunakan metode linear search,
    // memeriksa elemen satu per satu dari awal sampai ditemukan atau habis.
    // Kompleksitas waktu: O(n) -> pada kasus terburuk harus memeriksa seluruh elemen.
    public void cariLagu(String judul) {
        for (int i = 0; i < jumlahLagu; i++) {
            if (playlist[i].getJudul().equalsIgnoreCase(judul)) {
                System.out.println("Lagu ditemukan pada posisi ke-" + (i + 1) + ":");
                System.out.println(playlist[i].tampilkanInfo());
                return;
            }
        }
        System.out.println("Lagu dengan judul \"" + judul + "\" tidak ditemukan.");
    }

    // SORTING (BUBBLE SORT)
    // Mengurutkan lagu berdasarkan durasi secara ascending menggunakan bubble sort:
    // membandingkan setiap pasangan elemen bersebelahan dan menukar posisinya jika
    // urutannya salah, diulang sampai seluruh array terurut.
    // Kompleksitas waktu: O(n^2) -> dua perulangan bersarang, masing-masing hingga n kali,
    // karena dalam kasus terburuk setiap elemen harus dibandingkan dengan elemen lainnya.
    public void urutkanLaguBerdasarkanDurasi() {
        Lagu[] hasilSort = new Lagu[jumlahLagu];


        for (int i = 0; i < jumlahLagu; i++) {
            hasilSort[i] = playlist[i];
        }


        for (int i = 0; i < jumlahLagu - 1; i++) {
            for (int j = 0; j < jumlahLagu - i - 1; j++) {
                if (hasilSort[j].getDurasi() > hasilSort[j + 1].getDurasi()) {

                    Lagu temp = hasilSort[j];
                    hasilSort[j] = hasilSort[j + 1];
                    hasilSort[j + 1] = temp;
                }
            }
        }


        System.out.println("=== Hasil Sorting Durasi === \n");
        for (int i = 0; i < jumlahLagu; i++) {
            System.out.println(
                hasilSort[i].tampilkanInfo() + "\n"
            );
        }
    }
}