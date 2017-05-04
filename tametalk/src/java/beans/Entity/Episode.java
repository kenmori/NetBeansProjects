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
    String title;
    String content;
    public Episode(){}
    public Episode(Integer id, String title, String content){
        this.id = id;
        this.title = title;
        this.content = content;
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
