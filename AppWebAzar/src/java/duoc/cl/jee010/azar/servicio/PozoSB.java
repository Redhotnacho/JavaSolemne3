/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.servicio;

import duoc.cl.jee010.azar.entity.Pozo;
import duoc.cl.jee010.azar.persistence.ControladorException;
import duoc.cl.jee010.azar.persistence.PozoDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Nacho
 */
@Stateless
public class PozoSB {

    @EJB
    PozoDAO pozoDAO; 
    
    public void addPozo(Pozo pozo) throws ControladorException{
        pozoDAO.addPozo(pozo);
    }
    
    public void updatePozo(Pozo pozo) throws ControladorException{
        pozoDAO.updatePozo(pozo);
    }
    
    public void deletePozo(Pozo pozo) throws ControladorException{
        pozoDAO.deletePozo(pozo);
    }
    
    public List<Pozo> getAll() {
        return pozoDAO.getAll();
    }
    
    public Pozo getPozoXID(int id) {
        return pozoDAO.getPozoXID(id);
    }
}