/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author buddisantiko
 */
public class Dosen extends Orang implements Serializable {

    private Kelas[] daftarkelas=new Kelas[1000];
    private int jumKelas;
    private String KodeDosen;

    public Dosen(String nama, long nip) {
        super(nama, nip);
    }

    public Kelas getKelas(int index) {
        return daftarkelas[index];
    }

    public Kelas getKelasbyKodeKelas(String kdKelas) {
        Kelas k = null;
        for (int i = 0; i < jumKelas; i++) {
            if (daftarkelas[i].getNamakelas().equals(kdKelas)) {
                k = daftarkelas[i];

            }
        }
        return k;
    }
//    public Dosen(String status){
//		super(status);
//    }

    public int getJumKelas() {
        return jumKelas;
    }

    public void removeKelas(int index) {
        if (daftarkelas[index] != null) {
            for (int i = index + 1; i < jumKelas; i++) {
                daftarkelas[i - 1] = daftarkelas[i];
            }
        }
        jumKelas--;
    }

    public void createKelas(String namaKelas, int maxKelas) {

        if (jumKelas < daftarkelas.length) {
            daftarkelas[jumKelas] = new Kelas(namaKelas, maxKelas);
            jumKelas++;
        }
    }

    public String getKdKelas() {
        return KodeDosen;
    }

    public void setKdDosen(String KodeDosen) {
        this.KodeDosen = KodeDosen;
    }

    public void display() {
        System.out.println("DOSEN");
        System.out.println("Nama Dosen: " + super.getNama());
        System.out.println("NIM Dosen: " + super.getId());

    }

    @Override
    public String toString() {
        String nama = "Nama Dosen   : " + getNama() + "\n";
        String nip = "NIP Dosen  : " + super.getId() + "\n";
        String dKelas = "Kelas : ";
        for (int i = 0; i < this.jumKelas; i++) {
            dKelas += daftarkelas[i].getNamakelas() + "\nDaftar mahasiswa:\n";
            for (int j = 0; j < daftarkelas[i].getJmlMahasiswa(); j++) {
                dKelas += daftarkelas[i].getMahasiswabyIndex(j).getNama() + "\n";
            }
            dKelas += "\nDaftar tugas:\n";
            for (int j = 0; j < daftarkelas[i].getJumTugas(); j++) {
                dKelas += daftarkelas[i].getTugas(j).getDesk() + "\n";

            }
        }
        return nama + nip + dKelas;
//        return "Dosen{" + "daftarkelas=" + daftarkelas + ", jumKelas=" + jumKelas + ", KodeDosen=" + KodeDosen + '}';
    }

}
