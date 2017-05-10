/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 * @author moritakenji
 */
@Entity
public class Employee2101 implements Serializable {
    @Id @NotNull
    private Integer number; //番号
    private String name; //氏名
    private String mail; //メール
    public Employee2101(){}
    public Employee2101(Integer number, String name, String mail){
        this.number = number;
        this.name = name;
        this.mail = mail;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    
}
