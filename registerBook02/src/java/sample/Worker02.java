/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author moritakenji
 */
@Stateless
public class Worker02 {
    @PersistenceContext
    private EntityManager em;
    public void register(BookEntity02 be){
        em.persist(be);
    }
    public void update (BookEntity02 be){
        em.merge(be);
    }
    public BookEntity02 find (String key) {
        return em.find(BookEntity02.class, key);
    }
    public void delete (BookEntity02 be){
        em.remove(em.merge(be));
    }
    public List<BookEntity02> getData(){
        return em.createQuery("SELECT r FROM BookEntity02 r").getResultList();
    }
            
}