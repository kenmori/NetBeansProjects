/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 * @author moritakenji
 */
@Entity
@Table(name = "USER_DATA_3")
public class UserEntity03 implements Serializable {
    @Id @NotNull
    private String id;
    private String name;
    private String zipcode;
    private String address;
    @Embedded//エンティティのフィールドになる
    private Contact co;
    public UserEntity03(){}
    public UserEntity03(String id, String name, String zipcode, String address, Contact co){
        this.id = id;
        this.name = name;
        this.zipcode = zipcode;
        this.address = address;
        this.co = co;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    


    public String getAddress() {
        return address;
    }
    
    public String getTelephone(){
        return co.getTelephone();
    }
    
    public void setTelephone(String telephone){
        co.setTelephone(telephone);
    }
    
    public String getMail(){
        return co.getMail();
    }
    
    
}
