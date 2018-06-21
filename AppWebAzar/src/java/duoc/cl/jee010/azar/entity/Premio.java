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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "premio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Premio.findAll", query = "SELECT p FROM Premio p")
    , @NamedQuery(name = "Premio.findById", query = "SELECT p FROM Premio p WHERE p.id = :id")
    , @NamedQuery(name = "Premio.findByFechCreacion", query = "SELECT p FROM Premio p WHERE p.fechCreacion = :fechCreacion")
    , @NamedQuery(name = "Premio.findByEstado", query = "SELECT p FROM Premio p WHERE p.estado = :estado")
    , @NamedQuery(name = "Premio.findByMonto", query = "SELECT p FROM Premio p WHERE p.monto = :monto")})
public class Premio implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPremio")
    private List<Carton> cartonList;
    @JoinColumn(name = "id_pozo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pozo idPozo;
    @JoinColumn(name = "id_sorteo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sorteo idSorteo;
    @JoinColumn(name = "id_tipopremio", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoPremio idTipopremio;

    public Premio() {
    }

    public Premio(Integer id) {
        this.id = id;
    }

    public Premio(Integer id, Date fechCreacion, int estado, int monto) {
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
    public List<Carton> getCartonList() {
        return cartonList;
    }

    public void setCartonList(List<Carton> cartonList) {
        this.cartonList = cartonList;
    }

    public Pozo getIdPozo() {
        return idPozo;
    }

    public void setIdPozo(Pozo idPozo) {
        this.idPozo = idPozo;
    }

    public Sorteo getIdSorteo() {
        return idSorteo;
    }

    public void setIdSorteo(Sorteo idSorteo) {
        this.idSorteo = idSorteo;
    }

    public TipoPremio getIdTipopremio() {
        return idTipopremio;
    }

    public void setIdTipopremio(TipoPremio idTipopremio) {
        this.idTipopremio = idTipopremio;
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
        if (!(object instanceof Premio)) {
            return false;
        }
        Premio other = (Premio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.jee010.azar.entity.Premio[ id=" + id + " ]";
    }
    
}
