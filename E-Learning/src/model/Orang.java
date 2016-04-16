/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LENOVO X230
 */
public abstract class Orang{
	private String nama;
	private long id;
	//private String status;
	
	public String getNama(){
		return nama;
	}
	public void setNama(String nama){
		this.nama=nama;
	}
//	public String getStatus(){
//		return status;
//	}
//	public void setStatus(String status){
//		this.status=status;
//	}
	
	public long getId(){
		return id;
	}
	public void setId(long id){
		this.id=id;
	}
//	public Orang(String status){
//		setStatus(status);
//	}
	public Orang(String nama, long id){
		setNama(nama);
		setId(id);
	}
        public Orang(long id){
            this.id=id;
        }
	public abstract void display();
}