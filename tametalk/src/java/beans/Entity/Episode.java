/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 * @author moritakenji
 */
@Entity
public class Episode implements Serializable{
    @Id @NotNull
    Integer id;
    String genre;
    String title;
    String content;
    public void Episode(){}
    public void Episode(String genre, String title, String content, Integer id){
        this.genre = genre;
        this.title = title;
        this.content = content;
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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
