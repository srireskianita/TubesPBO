/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Widodo
 */
public class Matakuliah{
	private String kodeMk;
	private String namaMk;
	
        public Matakuliah(String kodeMk, String namaMk){
            setKodeMk(kodeMk);
            setNamaMk(namaMk);
        }
	public String getKodeMk(){
		return kodeMk;
	}
	public void setKodeMk(String kodeMk){
		this.kodeMk = kodeMk;
	}
	public String getNamaMk(){
		return namaMk;
	}
	public void setNamaMk(String namaMk){
		this.namaMk = namaMk;
	}
}

