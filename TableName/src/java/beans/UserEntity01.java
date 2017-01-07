/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

/**
 *
 * @author moritakenji
 */
@Entity
@Table(name="USER_DATA")
public class UserEntity01 implements Serializable {
    @Id @NotNull
    private String id;
    private String name;
    private String zipcode;
    private String address;
    
    public UserEntity01(){}
    public UserEntity01(
            String id, String name, String zipcode, String address
    ) {
        this.id = id;
        this.name = name;
        this.zipcode = zipcode;
        this.address = address;
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

    public String getAddress() {
        return address;
    }
}
