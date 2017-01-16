/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author moritakenji
 */
@Named(value="bc")
@ConversationScoped
public class BackingConv implements Serializable {
    @Inject
    private Conversation conv;
    private String title;
    private Integer quantity;
    private String name;
    private String address;
    
    public String showBuy() {
        if(conv.isTransient()) {
            conv.begin();
        }
        return "buy.xhtml";
    }
    public String showInfo(){
        return "info.xhtml";
    }
    
    public String showVerify(){
        return "verify.xhtml";
    }
    
    public String showStart() {
        conv.end();
        return "start.xhtml";
    }
            
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String next (){
        return "buy.xhtml";
    }
}
