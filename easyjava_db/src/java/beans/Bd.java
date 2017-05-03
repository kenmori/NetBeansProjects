/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

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
public class Bd {
    @NotNull
    private Integer number;
    @Size(max=30, min=1)
    private String name;
    @Size(max=30, min=1)
    private String mail;
    @EJB
    EmployeeDb db;
    @Inject
    public String next(){
        create();
        return null;
    }
    public void create(){
        Employee emp = new Employee(number, name, mail);
        try {
            db.create(emp);
            clear();
        } catch(Exception e){
            
        }
    }
    public void clear(){
        number = null;
        name = null;
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
