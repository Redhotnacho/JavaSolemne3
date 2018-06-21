/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.servicio;

import duoc.cl.jee010.azar.entity.Premio;
import duoc.cl.jee010.azar.persistence.ControladorException;
import duoc.cl.jee010.azar.persistence.PremioDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Nacho
 */
@Stateless
public class PremioSB {

    @EJB
    PremioDAO premioDAO; 
    
    public void addPremio(Premio premio) throws ControladorException{
        premioDAO.addPremio(premio);
    }
    
    public void updatePremio(Premio premio) throws ControladorException{
        premioDAO.updatePremio(premio);
    }
    
    public void deletePremio(Premio premio) throws ControladorException{
        premioDAO.deletePremio(premio);
    }
    
    public List<Premio> getAll() {
        return premioDAO.getAll();
    }
    
    public Premio getPremioXID(int id) {
        return premioDAO.getPremioXID(id);
    }
}