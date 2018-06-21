/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.servicio;

import duoc.cl.jee010.azar.entity.Carton;
import duoc.cl.jee010.azar.persistence.ControladorException;
import duoc.cl.jee010.azar.persistence.CartonDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Nacho
 */
@Stateless
public class CartonSB {

    @EJB
    CartonDAO cartonDAO; 
    
    public void addCarton(Carton carton) throws ControladorException{
        cartonDAO.addCarton(carton);
    }
    
    public void updateCarton(Carton carton) throws ControladorException{
        cartonDAO.updateCarton(carton);
    }
    
    public void deleteCarton(Carton carton) throws ControladorException{
        cartonDAO.deleteCarton(carton);
    }
    
    public List<Carton> getAll() {
        return cartonDAO.getAll();
    }
    
    public Carton getCartonXID(int id) {
        return cartonDAO.getCartonXID(id);
    }
}