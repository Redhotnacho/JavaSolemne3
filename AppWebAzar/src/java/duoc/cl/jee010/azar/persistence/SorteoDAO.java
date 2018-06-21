/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.persistence;

import duoc.cl.jee010.azar.entity.Sorteo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Nacho
 */
@Stateless
public class SorteoDAO {
    
    @PersistenceContext
    EntityManager em;

    public void addSorteo(Sorteo sorteo) throws ControladorException{
        em.persist(sorteo);
    }
    
    public void updateSorteo(Sorteo sorteo) throws ControladorException{
        em.merge(sorteo);
    }
    
    public void deleteSorteo(Sorteo sorteo) throws ControladorException{
        em.remove(sorteo);
    }
    
    public List<Sorteo> getAll(){
        return em.createNamedQuery("Sorteo.findAll", Sorteo.class).getResultList();
    }
    
    public Sorteo getSorteoXID(int id){
        return em.find(Sorteo.class, id);
    }
}