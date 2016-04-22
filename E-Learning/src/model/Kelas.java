/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author buddisantiko
 */
public class Kelas  {
    private Mahasiswa[] anggota=new Mahasiswa[30];
    private int jmlMahasiswa = 0;
    private String namaKelas;
    private Tugas[] tugas;
    private int jumTugas=0;
    private Matakuliah Matakuliah;

    public Kelas(String namaKelas, int maxjumTugas) {
        this.namaKelas = namaKelas;
        tugas=new Tugas[maxjumTugas];
    }
    public Matakuliah getMatakuliah(){
	return Matakuliah;
    }
    public void setMatakuliah(Matakuliah m){
	this.Matakuliah=m;
    }
    public void addMahasiswa(Mahasiswa m){
        //anggota[jmlMahasiswa++] = m;
        if (jmlMahasiswa< anggota.length)
        {
		anggota[jmlMahasiswa]=m;
		jmlMahasiswa++;
	} 
    }
    public void removeMahasiswa(long IdMhs) {
        int a = 0;
        for (a=0; a<anggota.length; a++) {
            if ( anggota[a].getId() == IdMhs) {
                break;
            }
        }
        anggota[a] = null;
        for (int b=0;b<anggota.length;b++) {
            if (anggota[b] == null) {
                while(b<(anggota.length-b)){
                   anggota[b] = anggota[b+1];
                    b++;
                }
            }
        }
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
    public String getNamakelas(){
        return namaKelas;
    }
    public void createTugas(String kodeTgs,String desk){
           if(jumTugas< tugas.length){
            tugas[jumTugas] = new Tugas(kodeTgs,desk);
            jumTugas++;
        }
    }

    public int getJmlMahasiswa() {
        return jmlMahasiswa;
    }

    public int getJumTugas() {
        return jumTugas;
    }

//    @Override
//    public String toString() {
//        return "Kelas{" + "anggota=" + anggota + ", jmlMahasiswa=" + jmlMahasiswa + ",\n namaKelas=" + namaKelas + ",\n tugas=" + tugas + ", jumTugas=" + jumTugas + ", Matakuliah=" + Matakuliah + '}';
//    }
    
    public void displayKelas(){
            System.out.println("Kelas: "+getNamakelas());
            System.out.println("MATAKULIAH");
            System.out.println("Nama Matakuliah: "+getMatakuliah().getNamaMk());
            System.out.println("Kode Matakuliah: "+getMatakuliah().getKodeMk());
            System.out.println();
        System.out.println("Daftar Tugas");
        for(int i=0;i<jumTugas;i++){
            System.out.println("TUGAS Ke-"+(i+1));
            System.out.println("Kode Tugas: "+getTugas(i).getKodeTgs());
            System.out.println("Deskripsi Tugas: "+getTugas(i).getDesk());
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