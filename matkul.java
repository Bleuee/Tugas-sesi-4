
package pertemuan6;

public class matkul extends Dosen{
    String nama;

    matkul(String nama){
        super(nama);
        this.nama = nama;
    }

    void info(){
        System.out.println("Mata Kuliah \t : " + this.nama);
    }
}
