/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.persistence;

import duoc.cl.jee010.azar.entity.Menu;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nacho
 */
@Stateless
public class MenuDAO {
    
    @PersistenceContext
    EntityManager em;

    public void addMenu(Menu menu) throws ControladorException{
        em.persist(menu);
    }
    
    public void updateMenu(Menu menu) throws ControladorException{
        em.merge(menu);
    }
    
    public void deleteMenu(Menu menu) throws ControladorException{
        em.remove(menu);
    }
    
    public List<Menu> getAll(){
        return em.createNamedQuery("Menu.findAll", Menu.class).getResultList();
    }
    
    public Menu getMenuXID(int id){
        return em.find(Menu.class, id);
    }
}