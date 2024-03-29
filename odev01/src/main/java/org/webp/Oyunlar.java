package org.webp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Oyunlar {

    @Id @GeneratedValue
    private Long Oyun_Id;

    @NotBlank
    @Length(min=1, max = 128)
    private String Oyun_Adı;

    public Long getOyun_Id() {
        return Oyun_Id;
    }

    public String getOyun_Adı() {
        return Oyun_Adı;
    }

    public void setOyun_Id(Long oyun_Id) {
        Oyun_Id = oyun_Id;
    }

    public void setOyun_Adı(String oyun_Adı) {
        Oyun_Adı = oyun_Adı;
    }

    public Oyunlar() {
    }

}

