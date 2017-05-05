/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author moritakenji
 */
 class StudentSample {
     public static void main(String... args){
         Student morita = new Student("kenji");
         morita.score = 80;
         morita.printScore();
         System.out.println(morita.name);
         Student okada = new Student("keiko");
         okada.score = 60;
         okada.printScore();
         CommentFriend friend = new CommentFriend("友達", "今日は友達に会いました");
         CommentHobby hobby = new CommentHobby("趣味", "今日は趣味のことをしました");
         hobby.send("print");
         friend.send("print");
     }
}
