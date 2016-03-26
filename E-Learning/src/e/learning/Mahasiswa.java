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
public class Mahasiswa extends Orang{
	private int semester;
	
	public int getSmt(){
		return semester;
	}
	public void setSmt(int semester){
		this.semester=semester;
	}
	
	public Mahasiswa(String status){
		super(status);
	}
	public Mahasiswa(String nama, long nim){
		super(nama,nim);
	}
	 public void display(){
             System.out.println("Nama Mahasiswa: "+super.getNama());
             System.out.println("NIM Mahasiswa: "+super.getId());
         }
	
}