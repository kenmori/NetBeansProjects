/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author moritakenji
 */
@Named
@RequestScoped
public class Bean01 {
    private String data = "Java EE 7の世界へ";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
