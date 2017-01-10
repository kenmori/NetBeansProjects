/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author moritakenji
 */
@Named
@RequestScoped
public class Bean07 {
    //画面から何を取得したいのか
    private Integer selectedItm;
    private static final Map<String, Integer> item;
  
    static {
        item = new LinkedHashMap<>();
        item.put("JavaScript", 1);
        item.put("VisualC#", 2);
        item.put("VisualBasic", 3);
        item.put("PHP", 4);
        item.put("Ruby", 5);
        item.put("Swift", 6);
    }
    
    public Map<String, Integer> getItem(){
        return item;
    }
      public Integer getSelectedItm() {
        return selectedItm;
    }

    public void setSelectedItm(Integer selectedItm) {
        this.selectedItm = selectedItm;
    }
    public String showResult(){
        return "result02.xhtml";
    }
}
