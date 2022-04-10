/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Musa AKYUZ
 */
public class Kamyon {
    private int id;
    private String marka;
    private int gunlukfiyat;

    public Kamyon() {
    }

    public Kamyon(int id, String marka, int gunlukfiyat) {
        this.id = id;
        this.marka = marka;
        this.gunlukfiyat = gunlukfiyat;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getGunlukfiyat() {
        return gunlukfiyat;
    }

    public void setGunlukfiyat(int gunlukfiyat) {
        this.gunlukfiyat = gunlukfiyat;
    }

    @Override
    public String toString() {
        return "Kamyon{" + "id=" + id + ", marka=" + marka + ", gunlukfiyat=" + gunlukfiyat + '}';
    }
    
    
}
