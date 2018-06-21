/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.persistence;

import duoc.cl.jee010.azar.entity.Venta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nacho
 */
@Stateless
public class VentaDAO {
    
    @PersistenceContext
    EntityManager em;

    public void addVenta(Venta venta) throws ControladorException{
        em.persist(venta);
    }
    
    public void updateVenta(Venta venta) throws ControladorException{
        em.merge(venta);
    }
    
    public void deleteVenta(Venta venta) throws ControladorException{
        em.remove(venta);
    }
    
    public List<Venta> getAll(){
        return em.createNamedQuery("Venta.findAll", Venta.class).getResultList();
    }
    
    public Venta getVentaXID(int id){
        return em.find(Venta.class, id);
    }
}