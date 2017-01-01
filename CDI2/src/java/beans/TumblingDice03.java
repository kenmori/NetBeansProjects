/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Random;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author moritakenji
 */
@Tumbling(value="kichi")
@RequestScoped
public class TumblingDice03 implements TumblingDice {
    @Override
    public String tumbling(){    
        Random rnd = new Random();
        int r = rnd.nextInt(10);
        String result = "中吉";
        if(r < 2){
            result = "大吉です";
        } else if(r >= 2 && r < 4) {
            result = "中吉です";
        } else if(r >= 4 && r < 6){
            result = "小吉です";
        } else if(r >= 6 && r < 8) {
            result = "凶です";
        }
            return result;
    }
    @Override
    public String getMessage (){
        return "TumblingDice03";
    }
}
