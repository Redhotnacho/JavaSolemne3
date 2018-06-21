/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.servicio;

import duoc.cl.jee010.azar.entity.Perfil;
import duoc.cl.jee010.azar.persistence.ControladorException;
import duoc.cl.jee010.azar.persistence.PerfilDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
/**
 *
 * @author Nacho
 */
@Stateless
public class PerfilSB {

    @EJB
    PerfilDAO perfilDAO; 
    
    public void addPerfil(Perfil perfil) throws ControladorException{
        perfilDAO.addPerfil(perfil);
    }
    
    public void updatePerfil(Perfil perfil) throws ControladorException{
        perfilDAO.updatePerfil(perfil);
    }
    
    public void deletePerfil(Perfil perfil) throws ControladorException{
        perfilDAO.deletePerfil(perfil);
    }
    
    public List<Perfil> getAll() {
        return perfilDAO.getAll();
    }
    
    public Perfil getPerfilXID(int id) {
        return perfilDAO.getPerfilXID(id);
    }
}