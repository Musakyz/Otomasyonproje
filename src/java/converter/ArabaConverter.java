 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;
import java.lang.String;
import dao.ArabaDao;
import entity.Araba;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

/**
 *
 * @author Musa AKYUZ
 */
@FacesConverter("arabaConverter")
public class ArabaConverter implements Converter {
    private ArabaDao arabaDao;
    private String String;

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
    int id=Integer.valueOf(String);
    Araba c=this.getArabaDao().findByID(id);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return c;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
    Araba c=(Araba)t;  
    return String.valueOf(c.getId());// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArabaDao getArabaDao() {
        if(arabaDao==null){
            this.arabaDao=new ArabaDao();
        }
        return arabaDao;
    }

    public void setArabaDao(ArabaDao arabaDao) {
        this.arabaDao = arabaDao;
    }
    
    
}
