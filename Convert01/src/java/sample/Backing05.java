/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.Date;


import javax.validation.constraints.*;

/**
 *
 * @author moritakenji
 */
@Named
@RequestScoped
public class Backing05 {
    @Pattern(regexp="^(¥¥d{3}-).+")
    private String isbn;
    
    @Size(min=1, max=60)
    private String title;
    
    @Min(500) @Max(9999) @NotNull
    private Integer price;
    
    @NotNull @Past
    private Date date;

   
    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public String showResult() {
        return "result05.xhtml";
    }
}

