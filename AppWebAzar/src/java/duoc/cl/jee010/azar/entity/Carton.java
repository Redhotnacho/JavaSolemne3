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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nacho
 */
@Entity
@Table(name = "carton")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carton.findAll", query = "SELECT c FROM Carton c")
    , @NamedQuery(name = "Carton.findById", query = "SELECT c FROM Carton c WHERE c.id = :id")
    , @NamedQuery(name = "Carton.findByFechCreacion", query = "SELECT c FROM Carton c WHERE c.fechCreacion = :fechCreacion")
    , @NamedQuery(name = "Carton.findByEstado", query = "SELECT c FROM Carton c WHERE c.estado = :estado")
    , @NamedQuery(name = "Carton.findByCombinacion", query = "SELECT c FROM Carton c WHERE c.combinacion = :combinacion")
    , @NamedQuery(name = "Carton.findByPrecio", query = "SELECT c FROM Carton c WHERE c.precio = :precio")
    , @NamedQuery(name = "Carton.findByNroSerie", query = "SELECT c FROM Carton c WHERE c.nroSerie = :nroSerie")})
public class Carton implements Serializable {

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
    @Size(min = 1, max = 100)
    @Column(name = "combinacion")
    private String combinacion;
    @Column(name = "precio")
    private Integer precio;
    @Size(max = 20)
    @Column(name = "nro_serie")
    private String nroSerie;
    @JoinColumn(name = "id_premio", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Premio idPremio;
    @JoinColumn(name = "id_sorteo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sorteo idSorteo;
    @JoinColumn(name = "id_venta", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Venta idVenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCarton")
    private List<MontoCarton> montoCartonList;

    public Carton() {
    }

    public Carton(Integer id) {
        this.id = id;
    }

    public Carton(Integer id, Date fechCreacion, int estado, String combinacion) {
        this.id = id;
        this.fechCreacion = fechCreacion;
        this.estado = estado;
        this.combinacion = combinacion;
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

    public String getCombinacion() {
        return combinacion;
    }

    public void setCombinacion(String combinacion) {
        this.combinacion = combinacion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
    }

    public Premio getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(Premio idPremio) {
        this.idPremio = idPremio;
    }

    public Sorteo getIdSorteo() {
        return idSorteo;
    }

    public void setIdSorteo(Sorteo idSorteo) {
        this.idSorteo = idSorteo;
    }

    public Venta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }

    @XmlTransient
    public List<MontoCarton> getMontoCartonList() {
        return montoCartonList;
    }

    public void setMontoCartonList(List<MontoCarton> montoCartonList) {
        this.montoCartonList = montoCartonList;
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
        if (!(object instanceof Carton)) {
            return false;
        }
        Carton other = (Carton) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.jee010.azar.entity.Carton[ id=" + id + " ]";
    }
    
}
