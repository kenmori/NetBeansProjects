/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import beans.Entity.Episode;
import beans.db.Episodedb;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author moritakenji
 */
@Named
@RequestScoped
public class Bd {
    private Integer id;
    private String title;
    private String content;
    
    
    
    @EJB
    Episodedb epi;
    
    public void create(){
        Episode fafa = new Episode(id, title, content);
        try {
            epi.create(fafa);
            clear();
        }catch(Exception e){}
    }
    public void clear(){
        this.id = null;
        this.title = null;
        this.content = null;   
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
}
