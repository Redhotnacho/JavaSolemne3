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
@Table(name = "monto_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MontoVenta.findAll", query = "SELECT m FROM MontoVenta m")
    , @NamedQuery(name = "MontoVenta.findById", query = "SELECT m FROM MontoVenta m WHERE m.id = :id")
    , @NamedQuery(name = "MontoVenta.findByFechCreacion", query = "SELECT m FROM MontoVenta m WHERE m.fechCreacion = :fechCreacion")
    , @NamedQuery(name = "MontoVenta.findByEstado", query = "SELECT m FROM MontoVenta m WHERE m.estado = :estado")
    , @NamedQuery(name = "MontoVenta.findByTipoPremio", query = "SELECT m FROM MontoVenta m WHERE m.tipoPremio = :tipoPremio")
    , @NamedQuery(name = "MontoVenta.findByMontoAcumulado", query = "SELECT m FROM MontoVenta m WHERE m.montoAcumulado = :montoAcumulado")
    , @NamedQuery(name = "MontoVenta.findByFechaInicio", query = "SELECT m FROM MontoVenta m WHERE m.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "MontoVenta.findByPeriodo", query = "SELECT m FROM MontoVenta m WHERE m.periodo = :periodo")})
public class MontoVenta implements Serializable {

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
    @Column(name = "tipo_premio")
    private Integer tipoPremio;
    @Column(name = "monto_acumulado")
    private Integer montoAcumulado;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Size(max = 50)
    @Column(name = "periodo")
    private String periodo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMontoventa")
    private List<MontoCarton> montoCartonList;

    public MontoVenta() {
    }

    public MontoVenta(Integer id) {
        this.id = id;
    }

    public MontoVenta(Integer id, Date fechCreacion, int estado) {
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

    public Integer getTipoPremio() {
        return tipoPremio;
    }

    public void setTipoPremio(Integer tipoPremio) {
        this.tipoPremio = tipoPremio;
    }

    public Integer getMontoAcumulado() {
        return montoAcumulado;
    }

    public void setMontoAcumulado(Integer montoAcumulado) {
        this.montoAcumulado = montoAcumulado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
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
        if (!(object instanceof MontoVenta)) {
            return false;
        }
        MontoVenta other = (MontoVenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.jee010.azar.entity.MontoVenta[ id=" + id + " ]";
    }
    
}
