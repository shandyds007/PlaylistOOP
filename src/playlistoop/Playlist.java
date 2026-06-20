package playlistoop;

public class Playlist {

    private Lagu[] daftarLagu;
    private int jumlahLagu;

    public Playlist(int kapasitas) {
        daftarLagu = new Lagu[kapasitas];
        jumlahLagu = 0;
    }

    public void tambahLagu(Lagu lagu) {

        if (jumlahLagu < daftarLagu.length) {
            daftarLagu[jumlahLagu] = lagu;
            jumlahLagu++;
        } else {
            System.out.println("Playlist penuh!");
        }
    }

    public Lagu[] getDaftarLagu() {
        return daftarLagu;
    }

    public int getJumlahLagu() {
        return jumlahLagu;
    }
}