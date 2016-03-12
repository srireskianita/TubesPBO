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
	for (int j=index ; j<10/*panjang array*/ && daftarkelas[j+1] != null ; j++ ){
		daftarkelas[j]= daftarkelas[j+1];
			daftarkelas[j+1]=null;
            }
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