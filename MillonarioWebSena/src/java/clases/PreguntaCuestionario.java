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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Equipo
 */
@Entity
@Table(name = "pregunta_cuestionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PreguntaCuestionario.findAll", query = "SELECT p FROM PreguntaCuestionario p")
    , @NamedQuery(name = "PreguntaCuestionario.findByCodigopreguntaCuestionario", query = "SELECT p FROM PreguntaCuestionario p WHERE p.codigopreguntaCuestionario = :codigopreguntaCuestionario")})
public class PreguntaCuestionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_preguntaCuestionario")
    private Integer codigopreguntaCuestionario;
    @JoinColumn(name = "codigo_cuestionario", referencedColumnName = "codigo_cuestionario")
    @ManyToOne(optional = false)
    private Cuestionario codigoCuestionario;
    @JoinColumn(name = "codigo_pregunta", referencedColumnName = "codigo_pregunta")
    @ManyToOne(optional = false)
    private Pregunta codigoPregunta;

    public PreguntaCuestionario() {
    }

    public PreguntaCuestionario(Integer codigopreguntaCuestionario) {
        this.codigopreguntaCuestionario = codigopreguntaCuestionario;
    }

    public Integer getCodigopreguntaCuestionario() {
        return codigopreguntaCuestionario;
    }

    public void setCodigopreguntaCuestionario(Integer codigopreguntaCuestionario) {
        this.codigopreguntaCuestionario = codigopreguntaCuestionario;
    }

    public Cuestionario getCodigoCuestionario() {
        return codigoCuestionario;
    }

    public void setCodigoCuestionario(Cuestionario codigoCuestionario) {
        this.codigoCuestionario = codigoCuestionario;
    }

    public Pregunta getCodigoPregunta() {
        return codigoPregunta;
    }

    public void setCodigoPregunta(Pregunta codigoPregunta) {
        this.codigoPregunta = codigoPregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigopreguntaCuestionario != null ? codigopreguntaCuestionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreguntaCuestionario)) {
            return false;
        }
        PreguntaCuestionario other = (PreguntaCuestionario) object;
        if ((this.codigopreguntaCuestionario == null && other.codigopreguntaCuestionario != null) || (this.codigopreguntaCuestionario != null && !this.codigopreguntaCuestionario.equals(other.codigopreguntaCuestionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.PreguntaCuestionario[ codigopreguntaCuestionario=" + codigopreguntaCuestionario + " ]";
    }
    
}
