/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nacho
 */
@Entity
@Table(name = "perfil_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PerfilMenu.findAll", query = "SELECT p FROM PerfilMenu p")
    , @NamedQuery(name = "PerfilMenu.findById", query = "SELECT p FROM PerfilMenu p WHERE p.id = :id")
    , @NamedQuery(name = "PerfilMenu.findByFechCreacion", query = "SELECT p FROM PerfilMenu p WHERE p.fechCreacion = :fechCreacion")
    , @NamedQuery(name = "PerfilMenu.findByEstado", query = "SELECT p FROM PerfilMenu p WHERE p.estado = :estado")})
public class PerfilMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fech_creacion", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado", insertable = false)
    private int estado;
    @JoinColumn(name = "id_menu", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Menu idMenu;
    @JoinColumn(name = "id_perfil", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Perfil idPerfil;

    public PerfilMenu() {
    }

    public PerfilMenu(Integer id) {
        this.id = id;
    }

    public PerfilMenu(Integer id, Date fechCreacion, int estado) {
        this.id = id;
        this.fechCreacion = fechCreacion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechCreacion() {
        return fechCreacion;
    }

    public void setFechCreacion(Date fechCreacion) {
        this.fechCreacion = fechCreacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Menu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Menu idMenu) {
        this.idMenu = idMenu;
    }

    public Perfil getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Perfil idPerfil) {
        this.idPerfil = idPerfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfilMenu)) {
            return false;
        }
        PerfilMenu other = (PerfilMenu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.jee010.azar.entity.PerfilMenu[ id=" + id + " ]";
    }
    
}
