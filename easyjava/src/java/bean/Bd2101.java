/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import java.util.logging.Logger;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author moritakenji
 */
@Named
@ViewScoped
public class Bd2101 implements Serializable{
    @NotNull
    private Integer number;
    @Size(max=20, min=1)
    
    private String name;
    @Size(max=30, min=1)
    private String mail;
    @EJB
    EmployeeDb2101 db;
    
    @Inject
    transient Logger log;
 
    public String create(){
        Employee2101 emp = new Employee2101(number, name, mail);//エンティティを作成
        try {
            db.create(emp);
            clear();
        } catch(Exception e) {
            log.fine("■" + number + "|" + e.getMessage());
        }
        return null;
    }
    public String update(){
        Employee2101 emp = new Employee2101(number, name, mail);
        try {
            db.update(emp);
            clear();
        } catch(Exception e) {
            log.fine("■" + number + "|" + e.getMessage());
        }
        return null;
    }
    public String edit(Employee2101 employee){
        number = employee.getNumber();
        name = employee.getName();
        mail = employee.getMail();
        return null;
    }
    public void clear(){//表示用に変数をクリアする
        number = null;
        name = null;
        mail = null;
    }
    public String find(){
        Employee2101 m = db.find(number);
        if(m !=null) {
            this.number = m.getNumber();
            this.name = m.getName();
            this.mail = m.getMail();
        }
        return null;
    }
    public String delete(Employee2101 employee) {
        db.delete(employee);
       return null;
    }
    public List<Employee2101> getAll(){
        return db.getAll();
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
