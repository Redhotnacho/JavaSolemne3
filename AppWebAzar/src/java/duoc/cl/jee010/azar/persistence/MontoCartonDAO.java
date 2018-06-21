/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.persistence;

import duoc.cl.jee010.azar.entity.MontoCarton;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nacho
 */
@Stateless
public class MontoCartonDAO {
    
    @PersistenceContext
    EntityManager em;

    public void addMontoCarton(MontoCarton montoCarton) throws ControladorException{
        em.persist(montoCarton);
    }
    
    public void updateMontoCarton(MontoCarton montoCarton) throws ControladorException{
        em.merge(montoCarton);
    }
    
    public void deleteMontoCarton(MontoCarton montoCarton) throws ControladorException{
        em.remove(montoCarton);
    }
    
    public List<MontoCarton> getAll(){
        return em.createNamedQuery("MontoCarton.findAll", MontoCarton.class).getResultList();
    }
    
    public MontoCarton getMontoCartonXID(int id){
        return em.find(MontoCarton.class, id);
    }
}