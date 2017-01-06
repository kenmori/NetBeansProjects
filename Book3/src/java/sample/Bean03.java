/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.Arrays;
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
public class Bean03 {
    private int[] selectedItms;
    private static final Map<String, Integer> items;
    static {
        items = new LinkedHashMap<>();
        items.put("ネットワーク構築", 1);
        items.put("データベース", 2);
        items.put("モバイル開発", 3);
    }
    public Map<String, Integer> getItems(){
        return items;
    }
    public String showResult(){
        return "result03.xhtml";
    }
    
    @Override
    public String toString(){
        return Arrays.toString(selectedItms);
    }
    public int[] getSelectedItms() {
        return selectedItms;
    }
    public void setSelectedItms(){
        this.selectedItms = selectedItms;
    }
    
}
