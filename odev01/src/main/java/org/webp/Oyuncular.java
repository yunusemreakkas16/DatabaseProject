package org.webp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Oyuncular {
    @Id @GeneratedValue
    private Long Oyuncu_Id;
    private String Oyuncu_Adi;
    private String Oyuncu_Soy_Adi;

    

    public Long getOyuncu_Id() {
        return Oyuncu_Id;
    }

    public String getOyuncu_Adi() {
        return Oyuncu_Adi;
    }

    public String getOyuncu_Soy_Adi() {
        return Oyuncu_Soy_Adi;
    }

    public void setOyuncu_Id(Long oyuncu_Id) {
        this.Oyuncu_Id = oyuncu_Id;
    }

    public void setOyuncu_Adi(String oyuncu_Adi) {
        this.Oyuncu_Adi = oyuncu_Adi;
    }

    public void setOyuncu_Soy_Adi(String oyuncu_Soy_Adi) {
        this.Oyuncu_Soy_Adi = oyuncu_Soy_Adi;
    }

    public Oyuncular() {
    }
}
