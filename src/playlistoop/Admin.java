package playlistoop;

public class Admin extends User {

    public Admin(String nama) {
        super(nama);
    }

    public void tambahLagu(Playlist playlist, Lagu lagu) {
        playlist.tambahLagu(lagu);
        System.out.println("Lagu berhasil ditambahkan!");
    }

    @Override
    public void menu() {
        System.out.println("Menu Admin");
    }
}