/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.learning;

/**
 *
 * @author LENOVO X230
 */
public class Main {
    public static void main(String[] args) {
        Dosen d1= new Dosen("Kurniawan Nur R",12345678);
        Dosen d2= new Dosen("Nungki Selviandro",23456789);
        d1.setStatus("Login");
        d2.setStatus("Login");
        d1.createKelas("IF-38-01");
        d2.createKelas("IF-38-02");
        d2.createKelas("IF-38-03");
        d1.createKelas("IF-38-04");
        Mahasiswa m1= new Mahasiswa("Widodo Setyo",1301140194);
        Mahasiswa m2= new Mahasiswa("Sri Reski Anita",1301140204);
        Mahasiswa m3= new Mahasiswa("Budi Santiko",1301144404);
        Mahasiswa m4= new Mahasiswa("Hafizha Fauzani",130114024);
        Mahasiswa m5= new Mahasiswa("Achika Fauziah",1301144044);
        Mahasiswa m6= new Mahasiswa("Lanny Septiani",1301141044);
        
        d1.getKelas(0).addMahasiswa(m1);
        d1.getKelas(0).addMahasiswa(m2);
        d1.getKelas(1).addMahasiswa(m3);
        d1.getKelas(1).addMahasiswa(m4);
        d2.getKelas(0).addMahasiswa(m5);
        d2.getKelas(1).addMahasiswa(m6);
        
        Matakuliah matkul1=new Matakuliah("CSG2H3","Pemrograman Berbasis Objek");
        Matakuliah matkul2=new Matakuliah("CSG2J3","Rekayasa Perangkat Lunak");
        d1.getKelas(0).setMatakuliah(matkul1);
        d1.getKelas(1).setMatakuliah(matkul1);
        d1.getKelas(0).createTugas("TGS-PBO-01");
        d1.getKelas(1).createTugas("TGS-PBO-01");
        d1.getKelas(0).createTugas("TGS-PBO-02");
        d2.getKelas(0).setMatakuliah(matkul2);
        d2.getKelas(1).setMatakuliah(matkul2);
        d2.getKelas(0).createTugas("TGS-RPL-04");
        d2.getKelas(1).createTugas("TGS-RPL-04");
        d2.getKelas(0).createTugas("TGS-RPL-05");
        
        //sebelum remove
        d1.display();
        
        d1.getKelas(0).displayKelas();
        d1.getKelas(1).displayKelas();
        d2.display();
        d2.getKelas(0).displayKelas();
        d2.getKelas(1).displayKelas();
        
        //setelah remove
        d2.removeKelas(0);
        d1.display();
        d1.getKelas(0).displayKelas();
        d1.getKelas(1).displayKelas();
        d2.display();
        d2.getKelas(0).displayKelas();
        d2.getKelas(1).displayKelas();
        
    }
}
