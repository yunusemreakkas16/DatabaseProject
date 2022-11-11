package org.webp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Oyunlar {

    @Id @GeneratedValue
    private Long Oyun_Id;
    private Long Oyun_Adı;

    public Long getOyun_Id() {
        return Oyun_Id;
    }

    public Long getOyun_Adı() {
        return Oyun_Adı;
    }

    public void setOyun_Id(Long oyun_Id) {
        Oyun_Id = oyun_Id;
    }

    public void setOyun_Adı(Long oyun_Adı) {
        Oyun_Adı = oyun_Adı;
    }

    public Oyunlar() {
    }
}
