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
public class Dosen extends Orang{
    
    private Kelas[] daftarkelas = new Kelas[10];	
    private int jumKelas=0;
    private String KodeDosen;
	
    
    public Dosen(String nama, long nip) {
        super(nama,nip);
    }
    public Kelas getKelas(int index){
        return daftarkelas[index];
    }
    public Dosen(String status){
		super(status);
    }
    public void removeKelas(int index){
	if (daftarkelas[index] != null)
	for (int i=index+1 ; i<jumKelas;i++ ){
		daftarkelas[i-1]= daftarkelas[i];
            }
        jumKelas--;
	}
    public void createKelas(String namaKelas){
        
         if(jumKelas< daftarkelas.length){
            daftarkelas[jumKelas] = new Kelas(namaKelas);
            jumKelas++;
        }
    }	
    public String getKdKelas(){
	return KodeDosen;
    }
    public void setKdDosen(String KodeDosen){
	this.KodeDosen=KodeDosen;
    }
    public void display(){
             System.out.println("DOSEN");
             System.out.println("Nama Dosen: "+super.getNama());
             System.out.println("NIM Dosen: "+super.getId());
             
             
         }
}