/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.persistence;

import duoc.cl.jee010.azar.entity.PerfilMenu;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nacho
 */
@Stateless
public class PerfilMenuDAO {
    
    @PersistenceContext
    EntityManager em;

    public void addPerfilMenu(PerfilMenu perfilMenu) throws ControladorException{
        em.persist(perfilMenu);
    }
    
    public void updatePerfilMenu(PerfilMenu perfilMenu) throws ControladorException{
        em.merge(perfilMenu);
    }
    
    public void deletePerfilMenu(PerfilMenu perfilMenu) throws ControladorException{
        em.remove(perfilMenu);
    }
    
    public List<PerfilMenu> getAll(){
        return em.createNamedQuery("PerfilMenu.findAll", PerfilMenu.class).getResultList();
    }
    
    public PerfilMenu getPerfilMenuXID(int id){
        return em.find(PerfilMenu.class, id);
    }
}