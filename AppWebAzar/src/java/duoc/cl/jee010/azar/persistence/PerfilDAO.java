/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.persistence;

import duoc.cl.jee010.azar.entity.Perfil;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author Nacho
 */
@Stateless
public class PerfilDAO {
    
    @PersistenceContext
    EntityManager em;

    public void addPerfil(Perfil perfil) throws ControladorException{
        em.persist(perfil);
    }
    
    public void updatePerfil(Perfil perfil) throws ControladorException{
        em.merge(perfil);
    }
    
    public void deletePerfil(Perfil perfil) throws ControladorException{
        em.remove(perfil);
    }
    
    public List<Perfil> getAll(){
        return em.createNamedQuery("Perfil.findAll", Perfil.class).getResultList();
    }
    
    public Perfil getPerfilXID(int id){
        return em.find(Perfil.class, id);
    }
}