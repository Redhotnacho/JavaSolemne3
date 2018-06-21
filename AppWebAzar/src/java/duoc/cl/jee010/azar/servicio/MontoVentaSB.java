/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.servicio;

import duoc.cl.jee010.azar.entity.MontoVenta;
import duoc.cl.jee010.azar.persistence.ControladorException;
import duoc.cl.jee010.azar.persistence.MontoVentaDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Nacho
 */
@Stateless
public class MontoVentaSB {

    @EJB
    MontoVentaDAO montoVentaDAO; 
    
    public void addMontoVenta(MontoVenta montoVenta) throws ControladorException{
        montoVentaDAO.addMontoVenta(montoVenta);
    }
    
    public void updateMontoVenta(MontoVenta montoVenta) throws ControladorException{
        montoVentaDAO.updateMontoVenta(montoVenta);
    }
    
    public void deleteMontoVenta(MontoVenta montoVenta) throws ControladorException{
        montoVentaDAO.deleteMontoVenta(montoVenta);
    }
    
    public List<MontoVenta> getAll() {
        return montoVentaDAO.getAll();
    }
    
    public MontoVenta getMontoVentaXID(int id) {
        return montoVentaDAO.getMontoVentaXID(id);
    }
}