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
@Table(name = "monto_carton")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MontoCarton.findAll", query = "SELECT m FROM MontoCarton m")
    , @NamedQuery(name = "MontoCarton.findById", query = "SELECT m FROM MontoCarton m WHERE m.id = :id")
    , @NamedQuery(name = "MontoCarton.findByFechCreacion", query = "SELECT m FROM MontoCarton m WHERE m.fechCreacion = :fechCreacion")
    , @NamedQuery(name = "MontoCarton.findByEstado", query = "SELECT m FROM MontoCarton m WHERE m.estado = :estado")})
public class MontoCarton implements Serializable {

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
    @JoinColumn(name = "id_montoventa", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MontoVenta idMontoventa;
    @JoinColumn(name = "id_carton", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Carton idCarton;

    public MontoCarton() {
    }

    public MontoCarton(Integer id) {
        this.id = id;
    }

    public MontoCarton(Integer id, Date fechCreacion, int estado) {
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

    public MontoVenta getIdMontoventa() {
        return idMontoventa;
    }

    public void setIdMontoventa(MontoVenta idMontoventa) {
        this.idMontoventa = idMontoventa;
    }

    public Carton getIdCarton() {
        return idCarton;
    }

    public void setIdCarton(Carton idCarton) {
        this.idCarton = idCarton;
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
        if (!(object instanceof MontoCarton)) {
            return false;
        }
        MontoCarton other = (MontoCarton) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.jee010.azar.entity.MontoCarton[ id=" + id + " ]";
    }
    
}
