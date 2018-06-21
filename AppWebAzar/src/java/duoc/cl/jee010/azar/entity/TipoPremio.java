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
@Table(name = "tipo_premio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoPremio.findAll", query = "SELECT t FROM TipoPremio t")
    , @NamedQuery(name = "TipoPremio.findById", query = "SELECT t FROM TipoPremio t WHERE t.id = :id")
    , @NamedQuery(name = "TipoPremio.findByFechCreacion", query = "SELECT t FROM TipoPremio t WHERE t.fechCreacion = :fechCreacion")
    , @NamedQuery(name = "TipoPremio.findByEstado", query = "SELECT t FROM TipoPremio t WHERE t.estado = :estado")
    , @NamedQuery(name = "TipoPremio.findByAciertos", query = "SELECT t FROM TipoPremio t WHERE t.aciertos = :aciertos")
    , @NamedQuery(name = "TipoPremio.findByCantidad", query = "SELECT t FROM TipoPremio t WHERE t.cantidad = :cantidad")
    , @NamedQuery(name = "TipoPremio.findByTipo", query = "SELECT t FROM TipoPremio t WHERE t.tipo = :tipo")})
public class TipoPremio implements Serializable {

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
    @Column(name = "aciertos")
    private Integer aciertos;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "tipo")
    private Integer tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipopremio")
    private List<Premio> premioList;

    public TipoPremio() {
    }

    public TipoPremio(Integer id) {
        this.id = id;
    }

    public TipoPremio(Integer id, Date fechCreacion, int estado) {
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

    public Integer getAciertos() {
        return aciertos;
    }

    public void setAciertos(Integer aciertos) {
        this.aciertos = aciertos;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
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
        if (!(object instanceof TipoPremio)) {
            return false;
        }
        TipoPremio other = (TipoPremio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.jee010.azar.entity.TipoPremio[ id=" + id + " ]";
    }
    
}
