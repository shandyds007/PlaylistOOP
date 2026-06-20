package playlistoop;

public class Main{
    public static void main(String[] args){

        /*
        Group 6
        Dewa Sembiring - 2902775443
        Muhammad Dustin - 2902799613
        Shandy Diaz Saputra - 2902773551
        Stefanus Rico Pandapotan Situngkir - 2902784441
         */

        // Test untuk class lagu
        // Contoh implementasi enkapsulasi
        Lagu[] playlist = new Lagu[5];

        playlist[0] = new Lagu();
        playlist[0].setJudul("Ini Judul 1");
        playlist[0].setArtis("Ini Artis 1");
        playlist[0].setDurasi(3);

        playlist[1] = new Lagu();
        playlist[1].setJudul("Ini Judul 2");
        playlist[1].setArtis("Ini Artis 2");
        playlist[1].setDurasi(4);

        playlist[2] = new Lagu();
        playlist[2].setJudul("Ini Judul 3");
        playlist[2].setArtis("Ini Artis 3");
        playlist[2].setDurasi(3);

        playlist[3] = new Lagu();
        playlist[3].setJudul("Ini Judul 4");
        playlist[3].setArtis("Ini Artis 4");
        playlist[3].setDurasi(4);

        playlist[4] = new Lagu();
        playlist[4].setJudul("Ini Judul 5");
        playlist[4].setArtis("Ini Artis 5");
        playlist[4].setDurasi(3);

        // Show playlist
        System.out.println("=== Playlist ===");
        for (int i = 0; i < playlist.length; i++){
            System.out.println("playlistOOP.Lagu ke-" + (i+1));
            System.out.println(playlist[i].tampilkanInfo());
        }

        // test user admin/member
        Playlist pl = new Playlist(10);
        Admin admin = new Admin("Dewa");
        Member member = new Member("Budi");

        // Admin add lagu
        admin.tambahLagu(pl,
                new Lagu("Monokrom", "Tulus", 4.5)
        );
        admin.tambahLagu(pl,
                new Lagu("Hati-Hati di Jalan", "Tulus", 4.2)
        );
        admin.tambahLagu(pl,
                new Lagu("Separuh Aku", "NOAH", 4.0)
        );

        // Member view playlist
        member.lihatPlaylist(pl);

        System.out.println();

        // Member mencari lagu
        member.cariLagu(pl, "Monokrom");

        System.out.println();

        // Contoh polymorphism
        User user1 = new Admin("Admin1");
        User user2 = new Member("Member1");

        user1.menu();
        user2.menu();

    }
}