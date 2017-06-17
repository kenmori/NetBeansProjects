/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 *
 * @author moritakenji
 */
public class Stack {
        private static final Map<Integer, String> map;
        static {
            map = new HashMap<>();
            map.put(1, "saitama");
            map.put(2, "kanagawa");
        }
    public static void main(String... args){
        StringStack stringstack = new StringStack();
        stringstack.push("三軒茶屋");
        List<String> list = new ArrayList<>();//繰り返すだけのListの場合
        List<String> linkedList = new LinkedList<>(); //要素を挿入や削除をする場合
        
        list.add("list1");
        System.out.println(map.toString());
        System.out.println(list);
    }
    
}
