/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.Random;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author moritakenji
 */
@RequestScoped
public class TumblingDice01 {
    public String tumbling(){    
        Random rnd = new Random();
        int r = rnd.nextInt(10);
        String result = "ラッキー";
        if(r < 2){
            result = "大ラッキー";
        } else if(r >= 2 && r < 4) {
            result = "ラッキー";
        } else if(r >= 4 && r < 6){
            result = "ちょっとラッキー";
        } else if(r >= 6 && r < 8) {
            result = "ほんのちょっとラッキ";
        }
            return result;
    }
    public String getMessage (){
        return "TumblingDice01";
    }
// static {
//     String fafa = "fafa";
//     String fafe; = "fafa"
//     String ii;
//     String lll;
//    }
// private String _math (){
//     return shometihig;
// }
// public String kazu (){
//     return this._math();
// }
}
