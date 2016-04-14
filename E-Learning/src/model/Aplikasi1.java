/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.sql.*;
import Database.*;

public class Aplikasi1 {
     private ArrayList<Mahasiswa> daftarMahasiswa;
    private Database connection;

    public Aplikasi1() {
        daftarMahasiswa = new ArrayList();
        connection = new Database();
        connection.connect();
    }
     public long createMahasiswa(String nama, long nim){
        Mahasiswa m= new Mahasiswa(nama,nim);
        daftarMahasiswa.add(m);
        connection.saveMahasiswa(m);
        return m.getId();
    }
     public Mahasiswa getMahasiswa(long nim){
        for(Mahasiswa m : daftarMahasiswa){
            if(m.getId()== nim){
                return m;
            }
        }
        Mahasiswa m = connection.getMahasiswa(nim);
        
        daftarMahasiswa.add(m);
        return m;
    }
      public String[] getListIdMahasiswa(){
        return connection.getListIdMahasiswa();
    }
       public void updateMahasiswa(Mahasiswa m){
        connection.updateMahasiswa(m);
    }
    
}
