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
public class CommentFriend extends WriteableComentAbstract {
    public CommentFriend(String title, String comment){
        super(title, comment);
    }
    @Override
    public void send(String event){
        System.out.println(title);
        System.out.println(comment);
    }
}
