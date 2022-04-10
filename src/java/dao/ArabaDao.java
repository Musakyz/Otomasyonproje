package dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import util.DBConnection;
import entity.Araba;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import util.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Musa AKYUZ
 */
public class ArabaDao {
    private Connection db;
    
   public void delete(Araba c){
        
            
      
      try{
          Statement st=this.getDb().createStatement();
          String query="delete from araba where id=" +c.getId();
          int r=st.executeUpdate(query);
          
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
   
       
       
   
   public void createAraba(Araba c){
        
            
      
     try{
          Statement st=this.getDb().createStatement();
          String query="insert into araba(id,marka,gunlukfiyat) values ('"+c.getId()+"','"+c.getMarka()+"','"+c.getGunlukfiyat()+"')";
          int r=st.executeUpdate(query);
          
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
   
       
         
           // String query="insert into araba values(id,marka,gunlukfiyat) values(6,'toyota',45)";
          //  int r=st.executeUpdate(query);
  
        
    
 public List<Araba> getArabaList(){
     List<Araba> arabaList=new ArrayList<>();
  
 
     
    try{
         Statement st=this.getDb().createStatement();
         String query="select *from araba";
         ResultSet rs=st.executeQuery(query);
         while(rs.next()){
             arabaList.add(new Araba(rs.getInt("id"),rs.getString("marka"),rs.getInt("gunlukfiyat")));
             System.out.println(+rs.getInt("id")+rs.getString("marka")+rs.getInt("gunlukfiyat"));
         } 
         
     }catch(Exception ex){
         System.out.println(ex.getMessage());
     }
        return arabaList;
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
    
   /*  public void delete(Araba c){
        
            
      
      try{
          Statement st=this.getDb().createStatement();
          String query="delete from araba where id="+c.getId();
          int r=st.executeUpdate(query);
          
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
   */

    public Araba findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

