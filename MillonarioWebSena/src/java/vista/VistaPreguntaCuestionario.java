/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import clases.Cuestionario;
import clases.Pregunta;
import clases.PreguntaCuestionario;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.component.inputtext.InputText;
import persistencia.CuestionarioFacade;
import persistencia.PreguntaCuestionarioFacade;
import persistencia.PreguntaFacade;

/**
 *
 * @author Estudiante
 */
@Named(value = "vistaPreguntaCuestionario")
@RequestScoped

public class VistaPreguntaCuestionario {

    @EJB
    private PreguntaFacade preguntaPersistencia;

    @EJB
    private CuestionarioFacade cuestionarioPersistencia;

    @EJB
    private PreguntaCuestionarioFacade preguntaCuestionarioPersistencia;

    private List<Pregunta> listaPregunta;

    private List<Cuestionario> listaCuestionario;

    private List<PreguntaCuestionario> listaPreguntaCuestionario;
    
     private InputText txtCodigo_preguntaCuestionario;
    private InputText txtCodigo_pregunta;
    private InputText txtOodigo_cuestionario;
    

    /**
     * Creates a new instance of VistaPreguntaCuestionario
     */
    public VistaPreguntaCuestionario() {
    }

    /**
     * @return the preguntaPersistencia
     */
    public PreguntaFacade getPreguntaPersistencia() {
        return preguntaPersistencia;
    }

    /**
     * @param preguntaPersistencia the preguntaPersistencia to set
     */
    public void setPreguntaPersistencia(PreguntaFacade preguntaPersistencia) {
        this.preguntaPersistencia = preguntaPersistencia;
    }

    /**
     * @return the cuestionarioPersistencia
     */
    public CuestionarioFacade getCuestionarioPersistencia() {
        return cuestionarioPersistencia;
    }

    /**
     * @param cuestionarioPersistencia the cuestionarioPersistencia to set
     */
    public void setCuestionarioPersistencia(CuestionarioFacade cuestionarioPersistencia) {
        this.cuestionarioPersistencia = cuestionarioPersistencia;
    }

    /**
     * @return the listaPregunta
     */
    public List<Pregunta> getListaPregunta() {
        listaPregunta = getPreguntaPersistencia().findAll();
        return listaPregunta;
    }

    /**
     * @param listaPregunta the listaPregunta to set
     */
    public void setListaPregunta(List<Pregunta> listaPregunta) {
        this.listaPregunta = listaPregunta;
    }

    /**
     * @return the listaCuestionario
     */
    public List<Cuestionario> getListaCuestionario() {
        listaCuestionario = getCuestionarioPersistencia().findAll();
        return listaCuestionario;
    }

    /**
     * @param listaCuestionario the listaCuestionario to set
     */
    public void setListaCuestionario(List<Cuestionario> listaCuestionario) {
        this.listaCuestionario = listaCuestionario;
    }

    /**
     * @return the preguntaCuestionarioPersistencia
     */
    public PreguntaCuestionarioFacade getPreguntaCuestionarioPersistencia() {
        return preguntaCuestionarioPersistencia;
    }

    /**
     * @param preguntaCuestionarioPersistencia the
     * preguntaCuestionarioPersistencia to set
     */
    public void setPreguntaCuestionarioPersistencia(PreguntaCuestionarioFacade preguntaCuestionarioPersistencia) {
        this.preguntaCuestionarioPersistencia = preguntaCuestionarioPersistencia;
    }

    /**
     * @return the listaPreguntaCuestionario
     */
    public List<PreguntaCuestionario> getListaPreguntaCuestionario() {
        listaPreguntaCuestionario = getPreguntaCuestionarioPersistencia().findAll();
        return listaPreguntaCuestionario;
    }

    /**
     * @param listaPreguntaCuestionario the listaPreguntaCuestionario to set
     */
    public void setListaPreguntaCuestionario(List<PreguntaCuestionario> listaPreguntaCuestionario) {
        this.listaPreguntaCuestionario = listaPreguntaCuestionario;
    }

    /**
     * @return the txtCodigo_preguntaCuestionario
     */
    public InputText getTxtCodigo_preguntaCuestionario() {
        return txtCodigo_preguntaCuestionario;
    }

    /**
     * @param txtCodigo_preguntaCuestionario the txtCodigo_preguntaCuestionario to set
     */
    public void setTxtCodigo_preguntaCuestionario(InputText txtCodigo_preguntaCuestionario) {
        this.txtCodigo_preguntaCuestionario = txtCodigo_preguntaCuestionario;
    }

    /**
     * @return the txtCodigo_pregunta
     */
    public InputText getTxtCodigo_pregunta() {
        return txtCodigo_pregunta;
    }

    /**
     * @param txtCodigo_pregunta the txtCodigo_pregunta to set
     */
    public void setTxtCodigo_pregunta(InputText txtCodigo_pregunta) {
        this.txtCodigo_pregunta = txtCodigo_pregunta;
    }

    /**
     * @return the txtOodigo_cuestionario
     */
    public InputText getTxtOodigo_cuestionario() {
        return txtOodigo_cuestionario;
    }

    /**
     * @param txtOodigo_cuestionario the txtOodigo_cuestionario to set
     */
    public void setTxtOodigo_cuestionario(InputText txtOodigo_cuestionario) {
        this.txtOodigo_cuestionario = txtOodigo_cuestionario;
    }

}
