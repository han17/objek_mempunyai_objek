/**
 * Created by DellPC on 6/10/2015.
 */
public class animasi {
    private String kategori;
    private Double durasi;
    private String jenis;
    private animator pembuat;

    public animasi(String kategori, Double durasi, String jenis, animator pembuat) {
        this.kategori = kategori;
        this.durasi = durasi;
        this.jenis = jenis;
        this.pembuat = pembuat;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Double getDurasi() {
        return durasi;
    }

    public void setDurasi(Double durasi) {
        this.durasi = durasi;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public animator getPembuat() {
        return pembuat;
    }

    public void setPembuat(animator pembuat) {
        this.pembuat = pembuat;
    }

    @Override
    public String toString() {
        return "animasi{" +
                "kategori='" + kategori + '\'' +
                ", durasi=" + durasi +
                ", jenis='" + jenis + '\'' +
                ", pembuat=" + pembuat +
                '}';
    }
}
