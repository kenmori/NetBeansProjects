/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author moritakenji
 */
@Named
@RequestScoped
public class BackingPage2 {
    @EJB
    private SSBean ssb2;

    public SSBean getSsb2() {
        return ssb2;
    }

    public void setSsb2(SSBean ssb2) {
        this.ssb2 = ssb2;
    }
    
    public String next(){
        return "page1.xhtml";
    }
}
