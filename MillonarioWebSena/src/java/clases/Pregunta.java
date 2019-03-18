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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "pregunta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pregunta.findAll", query = "SELECT p FROM Pregunta p")
    , @NamedQuery(name = "Pregunta.findByCodigoPregunta", query = "SELECT p FROM Pregunta p WHERE p.codigoPregunta = :codigoPregunta")
    , @NamedQuery(name = "Pregunta.findByPuntajePregunta", query = "SELECT p FROM Pregunta p WHERE p.puntajePregunta = :puntajePregunta")})
public class Pregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_pregunta")
    private Integer codigoPregunta;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "pregunta")
    private String pregunta;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "opcionA_pregunta")
    private String opcionApregunta;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "opcionB_pregunta")
    private String opcionBpregunta;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "opcionC_pregunta")
    private String opcionCpregunta;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "opcionD_pregunta")
    private String opcionDpregunta;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "opcionCorrecta_pregunta")
    private String opcionCorrectapregunta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntaje_pregunta")
    private int puntajePregunta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoPregunta")
    private List<PreguntaCuestionario> preguntaCuestionarioList;
    @JoinColumn(name = "codigo_usuario_pregunta", referencedColumnName = "codigo_usuario")
    @ManyToOne(optional = false)
    private Usuario codigoUsuarioPregunta;

    public Pregunta() {
    }

    public Pregunta(Integer codigoPregunta) {
        this.codigoPregunta = codigoPregunta;
    }

    public Pregunta(Integer codigoPregunta, String pregunta, String opcionApregunta, String opcionBpregunta, String opcionCpregunta, String opcionDpregunta, String opcionCorrectapregunta, int puntajePregunta) {
        this.codigoPregunta = codigoPregunta;
        this.pregunta = pregunta;
        this.opcionApregunta = opcionApregunta;
        this.opcionBpregunta = opcionBpregunta;
        this.opcionCpregunta = opcionCpregunta;
        this.opcionDpregunta = opcionDpregunta;
        this.opcionCorrectapregunta = opcionCorrectapregunta;
        this.puntajePregunta = puntajePregunta;
    }

    public Integer getCodigoPregunta() {
        return codigoPregunta;
    }

    public void setCodigoPregunta(Integer codigoPregunta) {
        this.codigoPregunta = codigoPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getOpcionApregunta() {
        return opcionApregunta;
    }

    public void setOpcionApregunta(String opcionApregunta) {
        this.opcionApregunta = opcionApregunta;
    }

    public String getOpcionBpregunta() {
        return opcionBpregunta;
    }

    public void setOpcionBpregunta(String opcionBpregunta) {
        this.opcionBpregunta = opcionBpregunta;
    }

    public String getOpcionCpregunta() {
        return opcionCpregunta;
    }

    public void setOpcionCpregunta(String opcionCpregunta) {
        this.opcionCpregunta = opcionCpregunta;
    }

    public String getOpcionDpregunta() {
        return opcionDpregunta;
    }

    public void setOpcionDpregunta(String opcionDpregunta) {
        this.opcionDpregunta = opcionDpregunta;
    }

    public String getOpcionCorrectapregunta() {
        return opcionCorrectapregunta;
    }

    public void setOpcionCorrectapregunta(String opcionCorrectapregunta) {
        this.opcionCorrectapregunta = opcionCorrectapregunta;
    }

    public int getPuntajePregunta() {
        return puntajePregunta;
    }

    public void setPuntajePregunta(int puntajePregunta) {
        this.puntajePregunta = puntajePregunta;
    }

    @XmlTransient
    public List<PreguntaCuestionario> getPreguntaCuestionarioList() {
        return preguntaCuestionarioList;
    }

    public void setPreguntaCuestionarioList(List<PreguntaCuestionario> preguntaCuestionarioList) {
        this.preguntaCuestionarioList = preguntaCuestionarioList;
    }

    public Usuario getCodigoUsuarioPregunta() {
        return codigoUsuarioPregunta;
    }

    public void setCodigoUsuarioPregunta(Usuario codigoUsuarioPregunta) {
        this.codigoUsuarioPregunta = codigoUsuarioPregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPregunta != null ? codigoPregunta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pregunta)) {
            return false;
        }
        Pregunta other = (Pregunta) object;
        if ((this.codigoPregunta == null && other.codigoPregunta != null) || (this.codigoPregunta != null && !this.codigoPregunta.equals(other.codigoPregunta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.Pregunta[ codigoPregunta=" + codigoPregunta + " ]";
    }
    
}
