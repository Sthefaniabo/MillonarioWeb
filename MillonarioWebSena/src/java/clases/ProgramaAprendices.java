/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Equipo
 */
@Entity
@Table(name = "programa_aprendices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProgramaAprendices.findAll", query = "SELECT p FROM ProgramaAprendices p")
    , @NamedQuery(name = "ProgramaAprendices.findByCodigoPrograma", query = "SELECT p FROM ProgramaAprendices p WHERE p.codigoPrograma = :codigoPrograma")
    , @NamedQuery(name = "ProgramaAprendices.findByCodigoFicha", query = "SELECT p FROM ProgramaAprendices p WHERE p.codigoFicha = :codigoFicha")
    , @NamedQuery(name = "ProgramaAprendices.findByNombreAprendiz", query = "SELECT p FROM ProgramaAprendices p WHERE p.nombreAprendiz = :nombreAprendiz")})
public class ProgramaAprendices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_programa")
    private Integer codigoPrograma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ficha")
    private int codigoFicha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_aprendiz")
    private String nombreAprendiz;
    @JoinColumn(name = "codigo_cuestionario", referencedColumnName = "codigo_cuestionario")
    @ManyToOne(optional = false)
    private Cuestionario codigoCuestionario;

    public ProgramaAprendices() {
    }

    public ProgramaAprendices(Integer codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public ProgramaAprendices(Integer codigoPrograma, int codigoFicha, String nombreAprendiz) {
        this.codigoPrograma = codigoPrograma;
        this.codigoFicha = codigoFicha;
        this.nombreAprendiz = nombreAprendiz;
    }

    public Integer getCodigoPrograma() {
        return codigoPrograma;
    }

    public void setCodigoPrograma(Integer codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public int getCodigoFicha() {
        return codigoFicha;
    }

    public void setCodigoFicha(int codigoFicha) {
        this.codigoFicha = codigoFicha;
    }

    public String getNombreAprendiz() {
        return nombreAprendiz;
    }

    public void setNombreAprendiz(String nombreAprendiz) {
        this.nombreAprendiz = nombreAprendiz;
    }

    public Cuestionario getCodigoCuestionario() {
        return codigoCuestionario;
    }

    public void setCodigoCuestionario(Cuestionario codigoCuestionario) {
        this.codigoCuestionario = codigoCuestionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPrograma != null ? codigoPrograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgramaAprendices)) {
            return false;
        }
        ProgramaAprendices other = (ProgramaAprendices) object;
        if ((this.codigoPrograma == null && other.codigoPrograma != null) || (this.codigoPrograma != null && !this.codigoPrograma.equals(other.codigoPrograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.ProgramaAprendices[ codigoPrograma=" + codigoPrograma + " ]";
    }
    
}
