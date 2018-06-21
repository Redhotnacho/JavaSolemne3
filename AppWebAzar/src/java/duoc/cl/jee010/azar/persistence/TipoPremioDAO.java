/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.persistence;

import duoc.cl.jee010.azar.entity.TipoPremio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nacho
 */
@Stateless
public class TipoPremioDAO {
    
    @PersistenceContext
    EntityManager em;

    public void addTipoPremio(TipoPremio tipoPremio) throws ControladorException{
        em.persist(tipoPremio);
    }
    
    public void updateTipoPremio(TipoPremio tipoPremio) throws ControladorException{
        em.merge(tipoPremio);
    }
    
    public void deleteTipoPremio(TipoPremio tipoPremio) throws ControladorException{
        em.remove(tipoPremio);
    }
    
    public List<TipoPremio> getAll(){
        return em.createNamedQuery("TipoPremio.findAll", TipoPremio.class).getResultList();
    }
    
    public TipoPremio getTipoPremioXID(int id){
        return em.find(TipoPremio.class, id);
    }
}
