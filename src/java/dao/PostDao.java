package dao;


import entity.Post;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import util.DBConnection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Musa AKYUZ
 */
public class PostDao {
    private Connection db;
    
   public void delete(Post c){
        
            
      
      try{
          Statement st=this.getDb().createStatement();
          String query="delete from post where id=" +c.getId();
          int r=st.executeUpdate(query);
          
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
   
       
       
   
   public void createPost(Post c){
        
            
      
     try{
          Statement st=this.getDb().createStatement();
          String query="insert into Post(id,category_id,title,context) values ('"+c.getId()+"','"+c.getCategory_id()+"','"+c.getTitle()+"','"+getContext()+"')";
          int r=st.executeUpdate(query);
          
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
   
       
         
           // String query="insert into araba values(id,marka,gunlukfiyat) values(6,'toyota',45)";
          //  int r=st.executeUpdate(query);
  
        
    
 public List<Post> getList(){
     List<Post> list=new ArrayList<>();
  
 
     
    try{
         Statement st=this.getDb().createStatement();
         String query="select * from post";
         ResultSet rs=st.executeQuery(query);
         while(rs.next()){
            list.add(new Post(rs.getInt("id"),rs.getInt("category_id"),rs.getString("title"),rs.getString("context")));
        
         } 
         
     }catch(Exception ex){
         System.out.println(ex.getMessage());
     }
        return list;
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

 
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    

    private String getContext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void create(Post entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}


