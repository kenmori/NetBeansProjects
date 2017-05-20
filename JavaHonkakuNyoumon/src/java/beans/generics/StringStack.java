/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.generics;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;

/**
 *
 * @author moritakenji
 */
@Named
public class StringStack {
   private List<String> taskList;

   public StringStack(){
        taskList = new ArrayList<>();
   }
   public void push(String task){
       taskList.add(task);
   }
   
   public String pop(){
       if(taskList.isEmpty()){
           return null;
       }
       return taskList.remove(taskList.size() -1);
   }
   
}
