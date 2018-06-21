/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.servicio;

import duoc.cl.jee010.azar.entity.PerfilMenu;
import duoc.cl.jee010.azar.persistence.ControladorException;
import duoc.cl.jee010.azar.persistence.PerfilMenuDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Nacho
 */
@Stateless
public class PerfilMenuSB {

    @EJB
    PerfilMenuDAO perfilMenuDAO; 
    
    public void addPerfilMenu(PerfilMenu perfilMenu) throws ControladorException{
        perfilMenuDAO.addPerfilMenu(perfilMenu);
    }
    
    public void updatePerfilMenu(PerfilMenu perfilMenu) throws ControladorException{
        perfilMenuDAO.updatePerfilMenu(perfilMenu);
    }
    
    public void deletePerfilMenu(PerfilMenu perfilMenu) throws ControladorException{
        perfilMenuDAO.deletePerfilMenu(perfilMenu);
    }
    
    public List<PerfilMenu> getAll() {
        return perfilMenuDAO.getAll();
    }
    
    public PerfilMenu getPerfilMenuXID(int id) {
        return perfilMenuDAO.getPerfilMenuXID(id);
    }
}