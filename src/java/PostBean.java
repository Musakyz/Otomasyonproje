
import dao.PostDao;
import entity.Post;
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
@Named
@SessionScoped
public class PostBean implements Serializable{
    private Post entity;
    private PostDao dao;
    private List<Post> list;

    public PostBean() {
    }

    public PostBean(Post entity, PostDao dao, List<Post> list) {
        this.entity = entity;
        this.dao = dao;
        this.list = list;
    }
    
   
     public void delete(Post c){
        this.getDao().delete(c);
    }
    public void create(){
        this.getDao().createPost(entity);
        this.entity=new Post();
    }
    

    public Post getEntity() {
        if(this.entity==null){
            this.entity=new Post();
            
        }
        return entity;
    }

    public void setEntity(Post entity) {
        this.entity = entity;
    }

   

    public PostDao getDao() {
        if(this.dao==null){
            this.dao=new PostDao();
        
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
  


    
    
    
    
    
}
