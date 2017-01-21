/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backing;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author moritakenji
 */
@Named
@RequestScoped
public class Callback {
    private String name;
 
    {
        System.out.println("--初期化ブロックが実行されました");
    }
    public Callback(){
        System.out.println("--コンストラクターが実行されました---");
    }
    @PostConstruct
    public void postConstruct (){
        System.out.println("--コンストラクターを実行し、"
        + "全てのインジェクション完了後の処理です---");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("---インスタンス破棄直前の処理です---");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
