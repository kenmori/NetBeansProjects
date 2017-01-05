/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.Arrays;
/**
 *
 * @author moritakenji
 */
@Named
@RequestScoped
public class Bean02 {
    private int[] selectedItms;
    public String showResult(){
        return "result02.xhtml";
    }
    @Override
    public String toString(){
        return Arrays.toString(selectedItms);
    }
    public int[] getSelectedItms(){
        return selectedItms;
    }
    public void setSelectedItms(int[] selectedItms){
        this.selectedItms = selectedItms;
    }
}
