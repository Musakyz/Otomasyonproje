
import entity.Araba;
import dao.ArabaDao;
import dao.KamyonDao;
import entity.Kamyon;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Musa AKYUZ
 */
public class AracKiralamaOtomasyonu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KamyonDao dao=new KamyonDao();
        List<Kamyon> list=dao.getKamyonList();
        for( Kamyon c:list){
            System.out.println(c);
            
        }
        
        // TODO code application logic here
    }
    
}

