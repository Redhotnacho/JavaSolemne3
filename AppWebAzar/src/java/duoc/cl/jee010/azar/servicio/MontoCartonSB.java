/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.servicio;

import duoc.cl.jee010.azar.entity.MontoCarton;
import duoc.cl.jee010.azar.persistence.ControladorException;
import duoc.cl.jee010.azar.persistence.MontoCartonDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Nacho
 */
@Stateless
public class MontoCartonSB {

    @EJB
    MontoCartonDAO montoCartonDAO; 
    
    public void addMontoCarton(MontoCarton montoCarton) throws ControladorException{
        montoCartonDAO.addMontoCarton(montoCarton);
    }
    
    public void updateMontoCarton(MontoCarton montoCarton) throws ControladorException{
        montoCartonDAO.updateMontoCarton(montoCarton);
    }
    
    public void deleteMontoCarton(MontoCarton montoCarton) throws ControladorException{
        montoCartonDAO.deleteMontoCarton(montoCarton);
    }
    
    public List<MontoCarton> getAll() {
        return montoCartonDAO.getAll();
    }
    
    public MontoCarton getMontoCartonXID(int id) {
        return montoCartonDAO.getMontoCartonXID(id);
    }
}