/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.db;

import beans.Entity.Episode;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author moritakenji
 */
@Stateless
public class Episodedb {
    @PersistenceContext
    EntityManager em;
    public void create(Episode epi){
        em.persist(epi);
    }
}
