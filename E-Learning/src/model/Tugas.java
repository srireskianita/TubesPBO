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
public class Tugas{
	private String kodeTgs;
	private String desk;

    public Tugas(String kodeTgs){
        this.kodeTgs=kodeTgs;
    }
		
    public String getKodeTgs(){
        return kodeTgs;
    }
    public void setKodeTgs(String kodeTgs){
	this.kodeTgs = kodeTgs;
    }
	public String getDesk(){
		return desk;
	}
	public void setDesk(String desk){
		this.desk = desk;
	}
}
