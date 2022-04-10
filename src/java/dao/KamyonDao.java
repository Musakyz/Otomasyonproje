/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Kamyon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author Musa AKYUZ
 */
public class KamyonDao {
    
    
    
        
    private Connection db;
    
    public void delete(Kamyon c){
        
            
      
      try{
          Statement st=this.getDb().createStatement();
          String query="delete from kamyon where id=" +c.getId();
          int r=st.executeUpdate(query);
          
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
   public void createKamyon(Kamyon c){
        
            
      
      try{
          Statement st=this.getDb().createStatement();
          String query="insert into kamyon(id,marka,gunlukfiyat) values ('"+c.getId()+"','"+c.getMarka()+"','"+c.getGunlukfiyat()+"')";
          int r=st.executeUpdate(query);
          
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
   
       
         
           // String query="insert into araba values(id,marka,gunlukfiyat) values(6,'toyota',45)";
          //  int r=st.executeUpdate(query);
  
        
    
 public List<Kamyon> getKamyonList(){
     List<Kamyon> kamyonList=new ArrayList<>();
  
 
     
    try{
         Statement st=this.getDb().createStatement();
         String query="select *from kamyon";
         ResultSet rs=st.executeQuery(query);
         while(rs.next()){
             kamyonList.add(new Kamyon(rs.getInt("id"),rs.getString("marka"),rs.getInt("gunlukfiyat")));
             System.out.println(+rs.getInt("id")+rs.getString("marka")+rs.getInt("gunlukfiyat"));
         } 
         
     }catch(Exception ex){
         System.out.println(ex.getMessage());
     }
        return kamyonList;
 } 
 

    public Connection getDb() {
        if(this.db==null){
            DBConnection dbc=new DBConnection();
            this.db=dbc.connect();
        }
        return db;
    }

    public void setDb(Connection db) {
        this.db = db;
    }
    
    
}


    

