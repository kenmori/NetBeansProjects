/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author moritakenji
 */
@Named
@RequestScoped
public class Bd2101 {
    @NotNull
    private Integer number = 0;
    @Size(max=20, min=1)
    
    private String name;
    @Size(max=30, min=1)
    private String mail;
    @EJB
    EmployeeDb2101 db;
    
    @Inject
    transient LoggerProducer log; 
 
    public String next(){
        create();
        return null;
    }
    public void create(){
        Employee2101 emp = new Employee2101(number, name, mail);//エンティティを作成
        try {
            db.create(emp);
            clear();
        } catch(Exception e) {
            log.createLogger().fine("★新規登録できない/" + number);
        }
    } 
    public void clear(){//表示用に変数をクリアする
        number = null;
        name = null;
        mail = null;
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
