/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

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
public class Bb0803 {
    private Integer[] cities;
    private static Map<String, Integer> items;
    static {//static初期化ブロック。バッキングビーンは何度も生成と破棄を繰り返すので選択肢が生成されるのを防ぐ。一度だけ生成したいので
        items = new LinkedHashMap<>();//HashMapやTreeMapがあるが登録順になるのはLinkHashMapだけなので
        items.put("東京", 1);
        items.put("大阪", 2);
        items.put("福岡", 3);
    }
    public Map<String, Integer> getItems(){//EL式から参照できるようにgetter。NOTE: staticなgetterはEL式から参照できない
        return items;
    }
    //itemsはユーザーからの入力で変わることがないのでsetItemsは不要。初期化後に値が変更されることはない
    public String next(){
        System.out.println();
        return "0803output.xhtml";
    }
    public Integer[] getCities() {
        return cities;
    }

    public void setCities(Integer[] cities) {
        this.cities = cities;
    }
    @Override
    public String toString(){
        return Arrays.toString(cities);
    }
}
