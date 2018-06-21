/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.servicio;

import duoc.cl.jee010.azar.entity.TipoPremio;
import duoc.cl.jee010.azar.persistence.ControladorException;
import duoc.cl.jee010.azar.persistence.TipoPremioDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Nacho
 */
@Stateless
public class TipoPremioSB {

    @EJB
    TipoPremioDAO tipoPremioDAO; 
    
    public void addTipoPremio(TipoPremio tipoPremio) throws ControladorException{
        tipoPremioDAO.addTipoPremio(tipoPremio);
    }
    
    public void updateTipoPremio(TipoPremio tipoPremio) throws ControladorException{
        tipoPremioDAO.updateTipoPremio(tipoPremio);
    }
    
    public void deleteTipoPremio(TipoPremio tipoPremio) throws ControladorException{
        tipoPremioDAO.deleteTipoPremio(tipoPremio);
    }
    
    public List<TipoPremio> getAll() {
        return tipoPremioDAO.getAll();
    }
    
    public TipoPremio getTipoPremioXID(int id) {
        return tipoPremioDAO.getTipoPremioXID(id);
    }
}