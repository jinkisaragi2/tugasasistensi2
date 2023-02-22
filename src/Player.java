public class Player{
    public String getNamaPlayer() {
        return namaPlayer;
    }

    public void setNamaPlayer(String namaPlayer) {
        this.namaPlayer = namaPlayer;
    }

    private String namaPlayer, status = "No";
    private int hp;
    private int skor;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public Player(String namaPlayer, int skor) {
        this.namaPlayer = namaPlayer;
        this.status = "No";
        this.hp = 100;
        this.skor = skor;
    }
}
