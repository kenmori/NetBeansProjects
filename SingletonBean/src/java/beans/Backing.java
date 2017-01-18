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
public class Backing {
    @EJB
    PrintManager pm;
    public String run(){
        pm.printOut();
        return "result";
    }
}
