/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author moritakenji
 */
public class DefineBookData {
    private String isbn;
    private String title;
    private Integer price;
    private String exp;
    
    public DefineBookData(){
        
    }
    public DefineBookData(String isbn, String title, Integer price, String exp){
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.exp = exp;
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

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
  
}
