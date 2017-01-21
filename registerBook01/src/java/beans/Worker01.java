/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author moritakenji
 */
@Stateless
public class Worker01 {
    @PersistenceContext//エンティティマネージャーをインジェクト
    private EntityManager em;//EntityManagerのインターフェイス型の変数にセット
    
    public void register(BookEntity01 be){
        em.persist(be);
    }
}
