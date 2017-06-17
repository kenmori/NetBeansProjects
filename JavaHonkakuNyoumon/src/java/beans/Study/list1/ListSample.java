/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.Study.list1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moritakenji
 */
public class ListSample {
  public static void main(String... args){
//       List list = new ArrayList();
//       list.add("java");
//       String element = (String)list.get(0);//オブジェクトを取り出しているのでキャストが必要
//       System.out.println(element);
      
      //ジェネリクスで取り出す時の型を保証する
      List<String> list = new ArrayList<>();//ダイアモンドオペレータで省略できる
      list.add("Java");
      String element = list.get(0);//取り出す時のキャストが不要になる
      System.out.println(element);
   }
}
