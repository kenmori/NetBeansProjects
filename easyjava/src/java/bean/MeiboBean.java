/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author moritakenji
 */
@Named//EL名
//JSFから参照するバッキングビーン名。単に@Namedだと先頭は小文字
@RequestScoped
//スコープアノテーションはバッキングビーンオブジェクト(JSFページとダイレクトにバインドするJavaクラス)の生成と破棄のタイミングをアプリケーションの実行過程(コンテキスト)と関連付けて指定する特徴がある
//Scopeはリクエストとレスポンスの間が生存期間、リクエストのたびに初期化される
public class MeiboBean {
    //フィールドをprivateにたアクセサを設けるクラスから生成されるオブジェクトをPOJO(Plain Old Java Object)という
    private int number;//int は初期化時は0 Integerはオブジェクトなのでnull
    private String name;
    public void toConsole(){
        System.out.println("number="+this.number+"/name="+this.name);
    }
    public String next(){
        //void　にしたらreturn null, ""と同じ。現在のページを返す。
        System.out.println("number=" + this.number + "/name=" + this.name);
        return "output.xhtml";
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
