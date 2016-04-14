/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import model.*;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    private String server="jdbc:mysql://localhost";
    private String dbuser="root";
    private String dbpassword="";
    private Statement statement;
    private Connection connection;
    
    public void connect(){
        try {
            connection = DriverManager.getConnection(server, dbuser, dbpassword);
            statement = connection.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void saveMahasiswa(Mahasiswa m){
        ResultSet rs=null;
        String query = "insert into Mahasiswa(nama,id) values("
                +"'"+m.getNama()+"',"
                +"'"+m.getId()+"' )";
        try {
            statement.execute(query,Statement.RETURN_GENERATED_KEYS);
            rs = statement.getGeneratedKeys();
            int generatedId = -1;
            if(rs.next()){
                generatedId = rs.getInt(1);
            }
            m.setId(generatedId);  
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    public Mahasiswa getMahasiswa(int nim){
        Mahasiswa m = null;
            String query = "Select * from Mahasiswa where id="+nim;
        try {
            
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                m = new Mahasiswa(rs.getString(1), rs.getLong(2));
            }        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return m;
    }
    
     public void updateMahasiswa(Mahasiswa m){
        String query="update Mahasiswa set nama = '"+m.getNama()+"',"
                +"NIM = '"+m.getId()+"'"
                +"where Id = "+m.getId();
        try {
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public String[] getListIdMahasiswa(){
        ArrayList<String> listId = new ArrayList();
        String query = "select * from Mahasiswa";
        ResultSet rs;
        try {
            rs = statement.executeQuery(query);
            while(rs.next()){
                listId.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listId.toArray(new String[0]);
    }
    
}