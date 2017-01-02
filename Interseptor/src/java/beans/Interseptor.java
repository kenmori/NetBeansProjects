/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.inject.Inject;
import javax.interceptor.AroundConstruct;
import javax.interceptor.InvocationContext;

/**
 *
 * @author moritakenji
 */
//Serializable インターフェイスを実装
public class Interseptor implements Serializable {
    //ロガーをインジェクト
    //LoggerクラスSerializeインターフェイスを実装していないので
    //シリアライズ処理から除外するtransient修飾子をつける
    @Inject
    transient Logger logger;
    //ログ作成に関する処理を行うクラスのオブジェクトをインジェクト
    @Inject
    LoggingHandler 1h;
    
    //コンストラクター用のインターセプター
    @AroundConstruct
    public void constructorLog(InvocationContext ic) throws Exception {
        logger.fine(
                //StringBulderオブジェクトを生成
                new StringBuilder().append(1h.getConstructorName(ic))
                .append("-->Constructor Process Start")//文字列を追加
                .append(":[Parameter]-->")
                .append(1h.getParamList(ic))
                .toString()
        );
        try {
            ic.proceed();
        } finally {
            logger.fine(
                    new StringBuilder()
                    //コンストラクター名を追加
                    .append(1h.getConstructorName(ic))
                    .append("-->Exit")
                    .toString())
            );
        }
    }
    
    //メソッド用のインターセプター
    @AroundInvoke
    public Object MethodLog (InvocationContext ic) throws Exception {
          logger.fine(
                //StringBulderオブジェクトを生成
                new StringBuilder().append(1h.getConstructorName(ic))
                .append("-->Constructor Process Start")//文字列を追加
                .append(":[Parameter]-->")
                .append(1h.getParamList(ic))
                .toString()
        );
        Object result = null;
        try {
            result = ic.proceed();
            return result;
        } finally {
                    logger.fine(
                    new StringBuilder()
                    //コンストラクター名を追加
                    .append(1h.getConstructorName(ic))
                    .append("-->Exit")
                    .toString())
            );
        }
    }
}
