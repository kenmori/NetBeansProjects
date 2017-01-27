/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author moritakenji
 */
@Embeddable // エンティティに組み込むフィールド定義されたクラス。エンティティの構造は変えたくないけどtableのカラムを増やしたい場合に使われる。エンティティ側でこれを取り込む
public class Contact implements Serializable {
    private String telephone;
    private String mail;
    public Contact(){}
    
    public Contact (String telephone, String mail){
        this.telephone = telephone;
        this.mail = mail;
    }
    public String getTelephone(){
        return telephone;
    }
    public String getMail(){
        return mail;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
}
