/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.servicio;

import duoc.cl.jee010.azar.entity.Venta;
import duoc.cl.jee010.azar.persistence.ControladorException;
import duoc.cl.jee010.azar.persistence.VentaDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Nacho
 */
@Stateless
public class VentaSB {

    @EJB
    VentaDAO ventaDAO; 
    
    public void addVenta(Venta venta) throws ControladorException{
        ventaDAO.addVenta(venta);
    }
    
    public void updateVenta(Venta venta) throws ControladorException{
        ventaDAO.updateVenta(venta);
    }
    
    public void deleteVenta(Venta venta) throws ControladorException{
        ventaDAO.deleteVenta(venta);
    }
    
    public List<Venta> getAll() {
        return ventaDAO.getAll();
    }
    
    public Venta getVentaXID(int id) {
        return ventaDAO.getVentaXID(id);
    }
}