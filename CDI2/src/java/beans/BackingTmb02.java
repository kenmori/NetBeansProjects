/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author moritakenji
 */
@Named(value = "tmb02")
@RequestScoped
public class BackingTmb02 {
    private String value;
    @Inject @Tumbling03
    private TumblingDice dice;
    public String chooseOne(){
        value = dice.tumbling();
        return null;
    }
    public String getValue() {
        return value;
    }
    public String getMessage(){
        return dice.getMessage();
    }
}
