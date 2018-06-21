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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nacho
 */
@Entity
@Table(name = "pozo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pozo.findAll", query = "SELECT p FROM Pozo p")
    , @NamedQuery(name = "Pozo.findById", query = "SELECT p FROM Pozo p WHERE p.id = :id")
    , @NamedQuery(name = "Pozo.findByFechCreacion", query = "SELECT p FROM Pozo p WHERE p.fechCreacion = :fechCreacion")
    , @NamedQuery(name = "Pozo.findByEstado", query = "SELECT p FROM Pozo p WHERE p.estado = :estado")
    , @NamedQuery(name = "Pozo.findByMonto", query = "SELECT p FROM Pozo p WHERE p.monto = :monto")})
public class Pozo implements Serializable {

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
    @Column(name = "monto")
    private int monto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPozo")
    private List<Premio> premioList;

    public Pozo() {
    }

    public Pozo(Integer id) {
        this.id = id;
    }

    public Pozo(Integer id, Date fechCreacion, int estado, int monto) {
        this.id = id;
        this.fechCreacion = fechCreacion;
        this.estado = estado;
        this.monto = monto;
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

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @XmlTransient
    public List<Premio> getPremioList() {
        return premioList;
    }

    public void setPremioList(List<Premio> premioList) {
        this.premioList = premioList;
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
        if (!(object instanceof Pozo)) {
            return false;
        }
        Pozo other = (Pozo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.jee010.azar.entity.Pozo[ id=" + id + " ]";
    }
    
}
