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
@Table(name = "sorteo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sorteo.findAll", query = "SELECT s FROM Sorteo s")
    , @NamedQuery(name = "Sorteo.findById", query = "SELECT s FROM Sorteo s WHERE s.id = :id")
    , @NamedQuery(name = "Sorteo.findByFechCreacion", query = "SELECT s FROM Sorteo s WHERE s.fechCreacion = :fechCreacion")
    , @NamedQuery(name = "Sorteo.findByEstado", query = "SELECT s FROM Sorteo s WHERE s.estado = :estado")
    , @NamedQuery(name = "Sorteo.findByFechaSorteo", query = "SELECT s FROM Sorteo s WHERE s.fechaSorteo = :fechaSorteo")
    , @NamedQuery(name = "Sorteo.findByCombinacionGanadora", query = "SELECT s FROM Sorteo s WHERE s.combinacionGanadora = :combinacionGanadora")})
public class Sorteo implements Serializable {

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
    @Column(name = "fecha_sorteo")
    @Temporal(TemporalType.DATE)
    private Date fechaSorteo;
    @Size(max = 50)
    @Column(name = "combinacion_ganadora")
    private String combinacionGanadora;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSorteo")
    private List<Carton> cartonList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSorteo")
    private List<Premio> premioList;

    public Sorteo() {
    }

    public Sorteo(Integer id) {
        this.id = id;
    }

    public Sorteo(Integer id, Date fechCreacion, int estado) {
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

    public Date getFechaSorteo() {
        return fechaSorteo;
    }

    public void setFechaSorteo(Date fechaSorteo) {
        this.fechaSorteo = fechaSorteo;
    }

    public String getCombinacionGanadora() {
        return combinacionGanadora;
    }

    public void setCombinacionGanadora(String combinacionGanadora) {
        this.combinacionGanadora = combinacionGanadora;
    }

    @XmlTransient
    public List<Carton> getCartonList() {
        return cartonList;
    }

    public void setCartonList(List<Carton> cartonList) {
        this.cartonList = cartonList;
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
        if (!(object instanceof Sorteo)) {
            return false;
        }
        Sorteo other = (Sorteo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.jee010.azar.entity.Sorteo[ id=" + id + " ]";
    }
    
}
