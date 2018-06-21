/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.persistence;

import duoc.cl.jee010.azar.entity.MontoVenta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nacho
 */
@Stateless
public class MontoVentaDAO {
    
    @PersistenceContext
    EntityManager em;

    public void addMontoVenta(MontoVenta montoVenta) throws ControladorException{
        em.persist(montoVenta);
    }
    
    public void updateMontoVenta(MontoVenta montoVenta) throws ControladorException{
        em.merge(montoVenta);
    }
    
    public void deleteMontoVenta(MontoVenta montoVenta) throws ControladorException{
        em.remove(montoVenta);
    }
    
    public List<MontoVenta> getAll(){
        return em.createNamedQuery("MontoVenta.findAll", MontoVenta.class).getResultList();
    }
    
    public MontoVenta getMontoVentaXID(int id){
        return em.find(MontoVenta.class, id);
    }
}