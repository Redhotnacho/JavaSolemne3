/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.persistence;

import duoc.cl.jee010.azar.entity.Carton;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nacho
 */
@Stateless
public class CartonDAO {
    
    @PersistenceContext
    EntityManager em;

    public void addCarton(Carton carton) throws ControladorException{
        em.persist(carton);
    }
    
    public void updateCarton(Carton carton) throws ControladorException{
        em.merge(carton);
    }
    
    public void deleteCarton(Carton carton) throws ControladorException{
        em.remove(carton);
    }
    
    public List<Carton> getAll(){
        return em.createNamedQuery("Carton.findAll", Carton.class).getResultList();
    }
    
    public Carton getCartonXID(int id){
        return em.find(Carton.class, id);
    }
}