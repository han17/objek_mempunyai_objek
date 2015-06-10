/**
 * Created by DellPC on 6/10/2015.
 */
public class Test_animasi {
    public static void  main (String[] args) {

        //klass autur
        animator masasiki  = new animator ("masasiki simoto","jepang",'L');
        System.out.println("Semua Data :" + masasiki.toString());
        System.out.println("Alamat Animator :" + masasiki.getAlamatAnimator());
        System.out.println("Nama Animator :" + masasiki.getNamaAnimator());
        System.out.println("gender :" + masasiki.getJenisKelamin());
        animasi naruto = new animasi ("Dewasa",01.00,"action",masasiki);
        System.out.println("semua data :"+ naruto.toString());
        System.out.println("Kategori Animasi :"+ naruto.getKategori());
        System.out.println("Durasi Animasi :"+ naruto.getDurasi());
        System.out.println("Jenis Animasi :"+ naruto.getJenis());
        System.out.println("Pencipta :"+ naruto.getPembuat());

    }
}
