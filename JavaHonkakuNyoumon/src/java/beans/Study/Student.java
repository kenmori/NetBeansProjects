/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.Study;

/**
 *
 * @author moritakenji
 */

public class Student {
    String name;
    int score;
    static final int MAX_SCORE = 100;
    Student(String name, int score){
        
        //インスタンス生成時点に値が決まって、後から変わらないようなもの
//        →コンストラクタで指定する
        //値が後から変わるもの
//        →メソッドやフィールドを通じて値を設定する
        this.name = name;
        this.score = score;
    }
    Student(String name){
        this(name, 0);
        //Student(String name, int score)を呼び出す書き方
        //似たようなコンストラクタを書くとメンテナンス性が失われるので引数が多いコンストラクタに必要な処理。少ないコンストラクタはこのようにコンストラクタを呼ぶようにする
    }
    void printScore(){
        System.out.println(name + "さんは" + MAX_SCORE + "点満点中" + score + "点です");
    }
    public static void main(String... args){
        System.out.println("fafafa");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}
