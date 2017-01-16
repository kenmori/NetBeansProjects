/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;
import javax.inject.Qualifier;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;

import java.lang.annotation.Target;

/**
 *
 * @author moritakenji
 */
@Qualifier
@Retention(RUNTIME)//Retentionはこれから定義するアノテーションを実行時にどのように扱うか定めたもの 
// RUNTIME クラスファイルに記録JavaVMに読み込まれることはない
//CLASS クラスファイルに記録され、実行時にJavaVMに読み込まれる
//SOURCE コンパイル時破棄。読み込む必要がない時
@Target({METHOD, FIELD, PARAMETER, TYPE}) //アノテーションの使える要素を指定

public @interface Tumbling {
    String value();
}
