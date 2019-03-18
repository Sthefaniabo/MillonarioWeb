/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Equipo
 */
@Entity
@Table(name = "cuestionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuestionario.findAll", query = "SELECT c FROM Cuestionario c")
    , @NamedQuery(name = "Cuestionario.findByCodigoCuestionario", query = "SELECT c FROM Cuestionario c WHERE c.codigoCuestionario = :codigoCuestionario")
    , @NamedQuery(name = "Cuestionario.findByNombreCuestionario", query = "SELECT c FROM Cuestionario c WHERE c.nombreCuestionario = :nombreCuestionario")
    , @NamedQuery(name = "Cuestionario.findByInstructorCuestionario", query = "SELECT c FROM Cuestionario c WHERE c.instructorCuestionario = :instructorCuestionario")
    , @NamedQuery(name = "Cuestionario.findByCodigoIngresoCuestionario", query = "SELECT c FROM Cuestionario c WHERE c.codigoIngresoCuestionario = :codigoIngresoCuestionario")})
public class Cuestionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_cuestionario")
    private Integer codigoCuestionario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_cuestionario")
    private String nombreCuestionario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "instructor_cuestionario")
    private String instructorCuestionario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codigo_ingreso_cuestionario")
    private String codigoIngresoCuestionario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoCuestionario")
    private List<ProgramaAprendices> programaAprendicesList;
    @JoinColumn(name = "codigo_cuestionario", referencedColumnName = "codigo_usuario", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoCuestionario")
    private List<PreguntaCuestionario> preguntaCuestionarioList;

    public Cuestionario() {
    }

    public Cuestionario(Integer codigoCuestionario) {
        this.codigoCuestionario = codigoCuestionario;
    }

    public Cuestionario(Integer codigoCuestionario, String nombreCuestionario, String instructorCuestionario, String codigoIngresoCuestionario) {
        this.codigoCuestionario = codigoCuestionario;
        this.nombreCuestionario = nombreCuestionario;
        this.instructorCuestionario = instructorCuestionario;
        this.codigoIngresoCuestionario = codigoIngresoCuestionario;
    }

    public Integer getCodigoCuestionario() {
        return codigoCuestionario;
    }

    public void setCodigoCuestionario(Integer codigoCuestionario) {
        this.codigoCuestionario = codigoCuestionario;
    }

    public String getNombreCuestionario() {
        return nombreCuestionario;
    }

    public void setNombreCuestionario(String nombreCuestionario) {
        this.nombreCuestionario = nombreCuestionario;
    }

    public String getInstructorCuestionario() {
        return instructorCuestionario;
    }

    public void setInstructorCuestionario(String instructorCuestionario) {
        this.instructorCuestionario = instructorCuestionario;
    }

    public String getCodigoIngresoCuestionario() {
        return codigoIngresoCuestionario;
    }

    public void setCodigoIngresoCuestionario(String codigoIngresoCuestionario) {
        this.codigoIngresoCuestionario = codigoIngresoCuestionario;
    }

    @XmlTransient
    public List<ProgramaAprendices> getProgramaAprendicesList() {
        return programaAprendicesList;
    }

    public void setProgramaAprendicesList(List<ProgramaAprendices> programaAprendicesList) {
        this.programaAprendicesList = programaAprendicesList;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @XmlTransient
    public List<PreguntaCuestionario> getPreguntaCuestionarioList() {
        return preguntaCuestionarioList;
    }

    public void setPreguntaCuestionarioList(List<PreguntaCuestionario> preguntaCuestionarioList) {
        this.preguntaCuestionarioList = preguntaCuestionarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoCuestionario != null ? codigoCuestionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuestionario)) {
            return false;
        }
        Cuestionario other = (Cuestionario) object;
        if ((this.codigoCuestionario == null && other.codigoCuestionario != null) || (this.codigoCuestionario != null && !this.codigoCuestionario.equals(other.codigoCuestionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.Cuestionario[ codigoCuestionario=" + codigoCuestionario + " ]";
    }
    
}
