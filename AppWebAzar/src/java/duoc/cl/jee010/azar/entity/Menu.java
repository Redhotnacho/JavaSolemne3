/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nacho
 */
@Entity
@Table(name = "menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m")
    , @NamedQuery(name = "Menu.findById", query = "SELECT m FROM Menu m WHERE m.id = :id")
    , @NamedQuery(name = "Menu.findByFechCreacion", query = "SELECT m FROM Menu m WHERE m.fechCreacion = :fechCreacion")
    , @NamedQuery(name = "Menu.findByEstado", query = "SELECT m FROM Menu m WHERE m.estado = :estado")
    , @NamedQuery(name = "Menu.findByNombreMenu", query = "SELECT m FROM Menu m WHERE m.nombreMenu = :nombreMenu")
    , @NamedQuery(name = "Menu.findByPadreMenu", query = "SELECT m FROM Menu m WHERE m.padreMenu = :padreMenu")
    , @NamedQuery(name = "Menu.findByDestinoMenu", query = "SELECT m FROM Menu m WHERE m.destinoMenu = :destinoMenu")})
public class Menu implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_menu")
    private String nombreMenu;
    @Column(name = "padre_menu")
    private Integer padreMenu;
    @Size(max = 100)
    @Column(name = "destino_menu")
    private String destinoMenu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMenu")
    private List<PerfilMenu> perfilMenuList;

    public Menu() {
    }

    public Menu(Integer id) {
        this.id = id;
    }

    public Menu(Integer id, Date fechCreacion, int estado, String nombreMenu) {
        this.id = id;
        this.fechCreacion = fechCreacion;
        this.estado = estado;
        this.nombreMenu = nombreMenu;
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

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public Integer getPadreMenu() {
        return padreMenu;
    }

    public void setPadreMenu(Integer padreMenu) {
        this.padreMenu = padreMenu;
    }

    public String getDestinoMenu() {
        return destinoMenu;
    }

    public void setDestinoMenu(String destinoMenu) {
        this.destinoMenu = destinoMenu;
    }

    @XmlTransient
    public List<PerfilMenu> getPerfilMenuList() {
        return perfilMenuList;
    }

    public void setPerfilMenuList(List<PerfilMenu> perfilMenuList) {
        this.perfilMenuList = perfilMenuList;
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
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.jee010.azar.entity.Menu[ id=" + id + " ]";
    }
    
}
