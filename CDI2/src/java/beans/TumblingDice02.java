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
@Tumbling02
@RequestScoped
public class TumblingDice02 implements TumblingDice {
    @Override
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
    @Override
    public String getMessage (){
        return "TumblingDice02";
    }
}
