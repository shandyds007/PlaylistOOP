package playlistoop;

public class Member extends User {

    public Member(String nama) {
        super(nama);
    }

    public void lihatPlaylist(Playlist playlist) {

        System.out.println("=== DAFTAR LAGU ===");

        for (int i = 0; i < playlist.getJumlahLagu(); i++) {

            System.out.println(
                    playlist.getDaftarLagu()[i].tampilkanInfo()
            );

            System.out.println("-------------------");
        }
    }

    public void cariLagu(Playlist playlist, String judul) {

        for (int i = 0; i < playlist.getJumlahLagu(); i++) {

            Lagu lagu = playlist.getDaftarLagu()[i];

            if (lagu.getJudul().equalsIgnoreCase(judul)) {

                System.out.println("Lagu ditemukan!");
                System.out.println(lagu.tampilkanInfo());
                return;
            }
        }

        System.out.println("Lagu tidak ditemukan.");
    }

    @Override
    public void menu() {
        System.out.println("Menu Member");
    }
}