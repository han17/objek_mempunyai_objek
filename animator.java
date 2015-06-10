/**
 * Created by DellPC on 6/10/2015.
 */
public class animator {
    private String namaAnimator;
    private String alamatAnimator ;
    private char jenisKelamin  ;

    public animator(String namaAnimator, String alamatAnimator, char jenisKelamin) {
        this.namaAnimator = namaAnimator;
        this.alamatAnimator = alamatAnimator;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNamaAnimator() {
        return namaAnimator;
    }

    public void setNamaAnimator(String namaAnimator) {
        this.namaAnimator = namaAnimator;
    }

    public String getAlamatAnimator() {
        return alamatAnimator;
    }

    public void setAlamatAnimator(String alamatAnimator) {
        this.alamatAnimator = alamatAnimator;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return "animator{" +
                "namaAnimator='" + namaAnimator + '\'' +
                ", alamatAnimator='" + alamatAnimator + '\'' +
                ", jenisKelamin=" + jenisKelamin +
                '}';
    }
}
