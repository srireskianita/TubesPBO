/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author LENOVO X230
 */
public class fileIO {
    public void simpanDataDosen(Dosen[] d, String namaFile){
        try {
            FileOutputStream fos = new FileOutputStream(namaFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
    
    public Dosen[] getDosen(){
        try {
            FileInputStream fos = new FileInputStream("dosen.txt");
            ObjectInputStream oos = new ObjectInputStream(fos);
            return (Dosen[]) oos.readObject();
        } catch (Throwable e) {
            return new Dosen[50];
        }
    }
    public void simpanDataMhs(Mahasiswa[] m, String namaFile){
        try {
            FileOutputStream fos = new FileOutputStream(namaFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
      public Mahasiswa[] getMhs(){
        try {
            FileInputStream fos = new FileInputStream("mhs.txt");
            ObjectInputStream oos = new ObjectInputStream(fos);
            return (Mahasiswa[]) oos.readObject();
        } catch (Throwable e) {
            return new Mahasiswa[50];
        }
    }
    public void simpanDataMK(Matakuliah[] mk, String namaFile){
        try {
            FileOutputStream fos = new FileOutputStream(namaFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(mk);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    } 
    public Matakuliah[] getMatkul(){
        try {
            FileInputStream fos = new FileInputStream("matkul.txt");
            ObjectInputStream oos = new ObjectInputStream(fos);
            return (Matakuliah[]) oos.readObject();
        } catch (Throwable e) {
            return new Matakuliah[50];
        }
    }
    
}
