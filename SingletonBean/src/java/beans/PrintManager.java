/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

/**
 *
 * @author moritakenji
 */
@Stateless
public class PrintManager {
    @Asynchronous
    public void printOut(){
        try {
            Thread.sleep(5000);
        } catch(Exception e){}
                
    }
}
