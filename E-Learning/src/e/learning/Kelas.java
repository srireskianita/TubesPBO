/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.learning;

/**
 *
 * @author buddisantiko
 */
public class Kelas {
    private Mahasiswa[] anggota=new Mahasiswa[30];
    private int jmlMahasiswa = 0;
    private String namaKelas;
    private Tugas[] tugas=new Tugas[10];
    private int jumTugas=0;
    private Matakuliah Matakuliah;

    public Kelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }
    public Matakuliah getMatakuliah(){
	return Matakuliah;
    }
    public void setMatakuliah(Matakuliah m){
	this.Matakuliah=m;
    }
    public void addMahasiswa(Mahasiswa m){
        anggota[jmlMahasiswa++] = m;
    }
    public Mahasiswa getMahasiswabyIndex(int index){
       return anggota[index];
    }
    public Mahasiswa getMahasiswabyNim(int id){
        return anggota[id];
    }
    public Tugas getTugas(int index){
        return tugas[index];
    }
    
    public void createTugas(String kodeTgs){
           if(jumTugas< tugas.length){
            tugas[jumTugas] = new Tugas(kodeTgs);
            jumTugas++;
        }
    }
    public void displayKelas(){
            System.out.println("MATAKULIAH");
            System.out.println("Nama Matakuliah: "+getMatakuliah().getNamaMk());
            System.out.println("Kode Matakuliah: "+getMatakuliah().getKodeMk());
            System.out.println();
        System.out.println("Daftar Tugas");
        for(int i=0;i<jumTugas;i++){
            System.out.println("TUGAS Ke-"+(i+1));
            System.out.println("Kode Tugas: "+getTugas(i).getKodeTgs());
        }
        System.out.println();
        System.out.println("Daftar Mahasiswa");
        for (int j=0;j<jmlMahasiswa;j++){
            System.out.println("MAHASISWA ke-"+(j+1));
            System.out.println("Nama Mahasiswa: "+getMahasiswabyIndex(j).getNama());
            System.out.println("NIM Mahasiswa: "+getMahasiswabyIndex(j).getId());
            System.out.println();
         }
        
    }
}