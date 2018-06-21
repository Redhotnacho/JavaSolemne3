/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.persistence;

import duoc.cl.jee010.azar.entity.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author Nacho
 */
@Stateless
public class UsuarioDAO {
    
    private static Logger log = Logger.getLogger(UsuarioDAO.class.getName());
    @PersistenceContext
    EntityManager em;

    public void addUsuario(Usuario usuario) throws ControladorException{
        em.persist(usuario);
    }
    
    public void updateUsuario(Usuario usuario) throws ControladorException{
        em.merge(usuario);
    }
    
    public void deleteUsuario(Usuario usuario) throws ControladorException{
        em.remove(usuario);
    }
    
    public List<Usuario> getAll(){
        return em.createNamedQuery("Usuario.findAll", Usuario.class).getResultList();
    }
    
    public Usuario getUsuarioXID(int id){
        return em.find(Usuario.class, id);
    }
    
    public Usuario validaUsuario(String username, String password){
        Usuario objUsuario=null;
        try {
            objUsuario = em.createNamedQuery("Usuario.validaUsuario", Usuario.class)
                    .setParameter("username",username)
                    .setParameter("password",password)
                    .getSingleResult();
        } catch (Exception ex) {
            log.log(Level.ERROR, "Error al validar usuario", ex);
        }
        return objUsuario;
    }
    
}