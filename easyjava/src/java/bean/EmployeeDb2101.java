/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author moritakenji
 */
@Stateless
public class EmployeeDb2101 {
    @PersistenceContext //エンティティマネージャーをインジェクトする
    private EntityManager em;
    public void create(Employee2101 employee){//データベースに新規登録する
        em.persist(employee);
    }
}
