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
    private boolean selectedItm;

    public boolean isSelectedItm() {
        return selectedItm;
    }

    public void setSelectedItm(boolean selectedItm) {
        this.selectedItm = selectedItm;
    }

    public String showResult(){
        return "result01.xhtml";
    }
}
