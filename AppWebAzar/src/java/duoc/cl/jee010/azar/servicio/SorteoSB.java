/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.servicio;

import duoc.cl.jee010.azar.entity.Sorteo;
import duoc.cl.jee010.azar.persistence.ControladorException;
import duoc.cl.jee010.azar.persistence.SorteoDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;


/**
 *
 * @author Nacho
 */
@Stateless
public class SorteoSB {

    @EJB
    SorteoDAO sorteoDAO; 
    
    public void addSorteo(Sorteo sorteo) throws ControladorException{
        sorteoDAO.addSorteo(sorteo);
    }
    
    public void updateSorteo(Sorteo sorteo) throws ControladorException{
        sorteoDAO.updateSorteo(sorteo);
    }
    
    public void deleteSorteo(Sorteo sorteo) throws ControladorException{
        sorteoDAO.deleteSorteo(sorteo);
    }
    
    public List<Sorteo> getAll() {
        return sorteoDAO.getAll();
    }
    
    public Sorteo getSorteoXID(int id) {
        return sorteoDAO.getSorteoXID(id);
    }
}