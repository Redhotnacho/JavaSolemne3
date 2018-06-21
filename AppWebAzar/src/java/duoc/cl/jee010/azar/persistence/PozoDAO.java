/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.persistence;

import duoc.cl.jee010.azar.entity.Pozo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nacho
 */
@Stateless
public class PozoDAO {
    
    @PersistenceContext
    EntityManager em;

    public void addPozo(Pozo pozo) throws ControladorException{
        em.persist(pozo);
    }
    
    public void updatePozo(Pozo pozo) throws ControladorException{
        em.merge(pozo);
    }
    
    public void deletePozo(Pozo pozo) throws ControladorException{
        em.remove(pozo);
    }
    
    public List<Pozo> getAll(){
        return em.createNamedQuery("Pozo.findAll", Pozo.class).getResultList();
    }
    
    public Pozo getPozoXID(int id){
        return em.find(Pozo.class, id);
    }
}