/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.persistence;

import duoc.cl.jee010.azar.entity.Premio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nacho
 */
@Stateless
public class PremioDAO {
    
    @PersistenceContext
    EntityManager em;

    public void addPremio(Premio premio) throws ControladorException{
        em.persist(premio);
    }
    
    public void updatePremio(Premio premio) throws ControladorException{
        em.merge(premio);
    }
    
    public void deletePremio(Premio premio) throws ControladorException{
        em.remove(premio);
    }
    
    public List<Premio> getAll(){
        return em.createNamedQuery("Premio.findAll", Premio.class).getResultList();
    }
    
    public Premio getPremioXID(int id){
        return em.find(Premio.class, id);
    }
}