/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.servicio;

import duoc.cl.jee010.azar.entity.Menu;
import duoc.cl.jee010.azar.persistence.ControladorException;
import duoc.cl.jee010.azar.persistence.MenuDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Nacho
 */
@Stateless
public class MenuSB {

    @EJB
    MenuDAO menuDAO; 
    
    public void addMenu(Menu menu) throws ControladorException{
        menuDAO.addMenu(menu);
    }
    
    public void updateMenu(Menu menu) throws ControladorException{
        menuDAO.updateMenu(menu);
    }
    
    public void deleteMenu(Menu menu) throws ControladorException{
        menuDAO.deleteMenu(menu);
    }
    
    public List<Menu> getAll() {
        return menuDAO.getAll();
    }
    
    public Menu getMenuXID(int id) {
        return menuDAO.getMenuXID(id);
    }
}