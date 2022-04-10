
import dao.KamyonDao;
import entity.Kamyon;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Musa AKYUZ
 */
@Named(value="kamyonBean")
@SessionScoped
public class KamyonBean  implements Serializable{
    private Kamyon entity;
    private KamyonDao dao;
    private List<Kamyon> list;

    public KamyonBean() {
    }

            
        
        
        public void delete(Kamyon c){
        this.getDao().delete(c);
    
    }
     public void create(){
         
         this.getDao().createKamyon(entity);
        this.entity=new Kamyon();
    }
     
    public Kamyon getEntity() {
        if(this.entity==null){
            this.entity=new Kamyon();
            
        }
        return entity;
    }

    public void setEntity(Kamyon entity) {
        this.entity = entity;
    }

    public KamyonDao getDao() {
         if(this.dao==null){
            this.dao=new KamyonDao();
        
        }
      
        return dao;
    }

    public void setDao(KamyonDao dao) {
        this.dao = dao;
    }

    public List<Kamyon> getList() {
        return list;
    }

    public void setList(List<Kamyon> list) {
        this.list = list;
    }
   
    
    
}
