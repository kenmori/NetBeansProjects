/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class UserWorker01 {
 
    @PersistenceContext
    private EntityManager em;
    public void register (UserEntity01 ue){
        em.persist(ue);
    }   
    public List<UserEntity01> getData() {
        return em.createQuery("SELECT r FROM UserEntity01 r").getResultList();
    }
}
