
import entity.Araba;
import dao.ArabaDao;
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
@Named(value="arabaBean")
@SessionScoped
public class ArabaBean implements Serializable{
    
    private Araba entity;
    private ArabaDao dao ;
    private List<Araba> list;
    
  

    public ArabaBean() {
    }

   
    
    
    public void delete(Araba c){
        this.getDao().delete(c);
    }
    public void create(){
        this.getDao().createAraba(entity);
        this.entity=new Araba();
    }
    

    public Araba getEntity() {
        if(this.entity==null){
            this.entity=new Araba();
            
        }
        return entity;
    }

    public void setEntity(Araba entity) {
        this.entity = entity;
    }

   

    public ArabaDao getDao() {
        if(this.dao==null){
            this.dao=new ArabaDao();
        
        }
      
        
        return dao;
    }

    public void setDao(ArabaDao dao) {
        this.dao = dao;
    }

    public List<Araba> getList() {
     this.list=this.getDao().getArabaList();
       return list;
    }

    public void setList(List<Araba> list) {
        this.list = list;
    }
    
    
    
    
}
  

