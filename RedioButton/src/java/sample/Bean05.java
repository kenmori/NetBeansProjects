/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author moritakenji
 */
@Named
@RequestScoped
public class Bean05 {
    private Integer selectedItm;
    private static final Map<String, Integer> item;

    public Map<String, Integer> getItem() {
        return item;
    }
    static {
        item = new LinkedHashMap<>();
        item.put("JavaScript", 1);
        item.put("VisualC#", 2);
        item.put("VisualBasic", 3);
        item.put("PHP", 4);
        item.put("Ruby", 5);
        item.put("Swift", 6);
        
    }
    public Integer getSelectedItm() {
        return selectedItm;
    }

    public void setSelectedItm(Integer selectedItm) {
        this.selectedItm = selectedItm;
    }
    public String showResult(){
        return "result01.xhtml";
    }
}
