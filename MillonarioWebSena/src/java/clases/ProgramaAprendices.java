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
    , @NamedQuery(name = "ProgramaAprendices.findByCodigoJuego", query = "SELECT p FROM ProgramaAprendices p WHERE p.codigoJuego = :codigoJuego")
    , @NamedQuery(name = "ProgramaAprendices.findByCodigoFicha", query = "SELECT p FROM ProgramaAprendices p WHERE p.codigoFicha = :codigoFicha")
    , @NamedQuery(name = "ProgramaAprendices.findByNombreAprendiz", query = "SELECT p FROM ProgramaAprendices p WHERE p.nombreAprendiz = :nombreAprendiz")
    , @NamedQuery(name = "ProgramaAprendices.findByPuntajeAprendiz", query = "SELECT p FROM ProgramaAprendices p WHERE p.puntajeAprendiz = :puntajeAprendiz")})
public class ProgramaAprendices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_juego")
    private Integer codigoJuego;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ficha")
    private int codigoFicha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_aprendiz")
    private String nombreAprendiz;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntaje_aprendiz")
    private int puntajeAprendiz;
    @JoinColumn(name = "codigo_cuestionario", referencedColumnName = "codigo_cuestionario")
    @ManyToOne(optional = false)
    private Cuestionario codigoCuestionario;

    public ProgramaAprendices() {
    }

    public ProgramaAprendices(Integer codigoJuego) {
        this.codigoJuego = codigoJuego;
    }

    public ProgramaAprendices(Integer codigoJuego, int codigoFicha, String nombreAprendiz, int puntajeAprendiz) {
        this.codigoJuego = codigoJuego;
        this.codigoFicha = codigoFicha;
        this.nombreAprendiz = nombreAprendiz;
        this.puntajeAprendiz = puntajeAprendiz;
    }

    public Integer getCodigoJuego() {
        return codigoJuego;
    }

    public void setCodigoJuego(Integer codigoJuego) {
        this.codigoJuego = codigoJuego;
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

    public int getPuntajeAprendiz() {
        return puntajeAprendiz;
    }

    public void setPuntajeAprendiz(int puntajeAprendiz) {
        this.puntajeAprendiz = puntajeAprendiz;
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
        hash += (codigoJuego != null ? codigoJuego.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgramaAprendices)) {
            return false;
        }
        ProgramaAprendices other = (ProgramaAprendices) object;
        if ((this.codigoJuego == null && other.codigoJuego != null) || (this.codigoJuego != null && !this.codigoJuego.equals(other.codigoJuego))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.ProgramaAprendices[ codigoJuego=" + codigoJuego + " ]";
    }
    
}
