package playlistoop;

public class User {
    protected String nama;

    public User(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // polymorphism
    public void menu() {
        System.out.println("Menu User");
    }
}