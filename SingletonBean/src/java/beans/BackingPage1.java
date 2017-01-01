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
public class BackingPage1 {
    @EJB
    private SSBean ssb1;

    public SSBean getSsb1() {
        return ssb1;
    }

    public void setSsb1(SSBean ssb1) {
        this.ssb1 = ssb1;
    }
    public String next(){
        return "page2.xhtml";
    }
}
