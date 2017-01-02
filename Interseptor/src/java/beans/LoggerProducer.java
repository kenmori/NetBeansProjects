/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

/**
 *
 * @author moritakenji
 */
//ロガーを生成するクラス
@Dependent
public class LoggerProducer {
    @Inject
    InjectionPoint point;
    
    /***
     * メソッドの戻り値のオブジェクトを
     * CDI Beanとしてインジェクとできるようにする
     * @return Loggerオブジェクト
     */
    @Produces
    public Logger getLogger(){
        String className = point.getMember()
                                .getDeclaringClass()
                                .getName();
        
        //インジェクト先のクラス名をロガー名にして
        //ロガーオブジェクトを取得する
        final Logger logger = Logger.getLogger(className);
        //とレース用の詳細レベルのログを出力
        logger.setLevel(Level.FINE);
        return logger;
    }
}
