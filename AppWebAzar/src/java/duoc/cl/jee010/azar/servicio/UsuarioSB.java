/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.servicio;

import duoc.cl.jee010.azar.entity.Usuario;
import duoc.cl.jee010.azar.persistence.UsuarioDAO;
import duoc.cl.jee010.azar.persistence.ControladorException;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Nacho
 */
@Stateless
public class UsuarioSB {

    @EJB
    UsuarioDAO usuarioDAO; 
    
    public void addUsuario(Usuario usuario) throws ControladorException{
        usuarioDAO.addUsuario(usuario);
    }
    
    public void updateUsuario(Usuario usuario) throws ControladorException{
        usuarioDAO.updateUsuario(usuario);
    }
    
    public void deleteUsuario(Usuario usuario) throws ControladorException{
        usuarioDAO.deleteUsuario(usuario);
    }
    
    public List<Usuario> getAll() {
        return usuarioDAO.getAll();
    }
    
    public Usuario getUsuarioXID(int id) {
        return usuarioDAO.getUsuarioXID(id);
    }
    
    public Usuario validaUsuario(String username, String password) {
        return usuarioDAO.validaUsuario(username, password);
    }
    
}