package playlistoop;

public class Lagu {
    private String judul;
    private String artis;
    private double durasi;

    // Constructor
    public Lagu(String judul, String artis, double durasi){
        this.judul = judul;
        this.artis = artis;
        this.durasi = durasi;
    }

    public Lagu(){

    }

    // Getter and Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getArtis() {
        return artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public double getDurasi() {
        return durasi;
    }

    public void setDurasi(double durasi) {
        this.durasi = durasi;
    }

    // Method untuk show playlistOOP.Lagu
    public String tampilkanInfo(){
        return "Judul\t: " + getJudul() +
                "\nArtis\t: " + getArtis() +
                "\nDurasi\t: " +getDurasi();
    }
}
