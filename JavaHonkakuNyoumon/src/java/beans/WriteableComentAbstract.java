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
public abstract class WriteableComentAbstract {
    protected String title;
    protected String comment;
    public WriteableComentAbstract(String title, String comment){
        this.title = title;
        this.comment = comment;
    }
    public abstract void send(String event);
}
