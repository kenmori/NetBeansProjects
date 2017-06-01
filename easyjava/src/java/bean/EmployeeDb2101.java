/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;
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
    public void update(Employee2101 employee) {
        em.merge(employee);
    }
    public Employee2101 find(Integer key) {
        return em.find(Employee2101.class, key);
    }
    public void delete(Employee2101 employee){
        em.remove(em.merge(employee));
    }
    public List<Employee2101> getAll(){
        return em.createQuery("SELECT c FROM Employee2101 c").getResultList();
    }
    
}
