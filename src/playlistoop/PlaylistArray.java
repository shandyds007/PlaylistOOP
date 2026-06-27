package playlistoop;

public class PlaylistArray {

    private Lagu[] playlist = new Lagu[10];
    private int jumlahLagu = 0;


    public PlaylistArray(Lagu[] lagu){
        jumlahLagu = lagu.length;
        for(int i = 0; i < lagu.length; i++){
            playlist[i] = lagu[i];
        }
    }

    public void tampilkanSemuaLagu(){
        for(int i = 0; i < jumlahLagu; i++){
            System.out.println(playlist[i].tampilkanInfo() + "\n");
            
        }
    }

    public void tambahLagu(Lagu lagu){
        if(jumlahLagu < playlist.length){
            playlist[jumlahLagu] = lagu;
            jumlahLagu++;
            System.out.println("Lagu Berhasil Ditambahkan ke Playlist");
        }
        else{
            System.out.print("Lagu sudah Full");
        }
    }

   public void hapusLagu(int index){
    if(index < 0 || index >= jumlahLagu){
        System.out.println("Index tidak valid");
        return;
    }

    Lagu[] laguBaru = new Lagu[playlist.length];

    for(int i = 0; i < index; i++){
        laguBaru[i] = playlist[i];
    }

    for(int i = index; i < jumlahLagu - 1; i++){
        laguBaru[i] = playlist[i + 1];
    }

    for(int i = 0; i < playlist.length; i++){
        playlist[i] = laguBaru[i];
    }

    jumlahLagu--;
}
    public void cariLagu(String nama){
        for(int i = 0; i < playlist.length; i++){
            boolean ketemu = false;
            if(playlist[i].getJudul() == nama){
                System.out.println("lagu dengan judul : " + playlist[i].getJudul() 
                + " ditemukan pada list ke  : " + (i + 1));
                ketemu = true;
                break;

            } 
            if(!ketemu){
                System.out.println("Lagu Tidak Ditemukan");
            }
        }

    }

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