package entity;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Musa AKYUZ
 */
public class Araba {
  private int id;
  private String marka;
  private int gunlukfiyat;

    public Araba() {
    }

  
  
    public Araba(int id, String marka, int gunlukfiyat) {
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
        return "Araba{" + "id=" + id + ", marka=" + marka + ", gunlukfiyat=" + gunlukfiyat + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Araba other = (Araba) obj;
        return this.id == other.id;
    }

   
  
}

