/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import clases.Cuestionario;
import clases.ProgramaAprendices;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;
import persistencia.CuestionarioFacade;
import persistencia.ProgramaAprendicesFacade;

/**
 *
 * @author Equipo
 */
@Named(value = "vistaJugar")
@RequestScoped
public class VistaJugar {

    @EJB
    private CuestionarioFacade cuesPersistencia;
    private ProgramaAprendicesFacade proAprePersistencia;

    private List<Cuestionario> listaCuest;
    private List<ProgramaAprendices> listaProApren;
    private InputText txtIdAprendiz;
    private InputText txtIngresoCuestionario;
    private CommandButton btnIngresar;
    private CommandButton btnLimpiar;

    /**
     * Creates a new instance of VistaJugar
     */
    public VistaJugar() {
    }

    /**
     * @return the cuesPersistencia
     */
    public CuestionarioFacade getCuesPersistencia() {
        return cuesPersistencia;
    }

    /**
     * @param cuesPersistencia the cuesPersistencia to set
     */
    public void setCuesPersistencia(CuestionarioFacade cuesPersistencia) {
        this.cuesPersistencia = cuesPersistencia;
    }

    /**
     * @return the proAprePersistencia
     */
    public ProgramaAprendicesFacade getProAprePersistencia() {
        return proAprePersistencia;
    }

    /**
     * @param proAprePersistencia the proAprePersistencia to set
     */
    public void setProAprePersistencia(ProgramaAprendicesFacade proAprePersistencia) {
        this.proAprePersistencia = proAprePersistencia;
    }

    /**
     * @return the listaCuest
     */
    public List<Cuestionario> getListaCuest() {
        listaCuest = cuesPersistencia.findAll();
        return listaCuest;
    }

    /**
     * @param listaCuest the listaCuest to set
     */
    public void setListaCuest(List<Cuestionario> listaCuest) {
        this.listaCuest = listaCuest;
    }

    /**
     * @return the listaProApren
     */
    public List<ProgramaAprendices> getListaProApren() {
        listaProApren = proAprePersistencia.findAll();
        return listaProApren;
    }

    /**
     * @param listaProApren the listaProApren to set
     */
    public void setListaProApren(List<ProgramaAprendices> listaProApren) {
        this.listaProApren = listaProApren;
    }

    /**
     * @return the txtIdAprendiz
     */
    public InputText getTxtIdAprendiz() {
        return txtIdAprendiz;
    }

    /**
     * @param txtIdAprendiz the txtIdAprendiz to set
     */
    public void setTxtIdAprendiz(InputText txtIdAprendiz) {
        this.txtIdAprendiz = txtIdAprendiz;
    }

    /**
     * @return the txtIngresoCuestionario
     */
    public InputText getTxtIngresoCuestionario() {
        return txtIngresoCuestionario;
    }

    /**
     * @param txtIngresoCuestionario the txtIngresoCuestionario to set
     */
    public void setTxtIngresoCuestionario(InputText txtIngresoCuestionario) {
        this.txtIngresoCuestionario = txtIngresoCuestionario;
    }

    /**
     * @return the btnIngresar
     */
    public CommandButton getBtnIngresar() {
        return btnIngresar;
    }

    /**
     * @param btnIngresar the btnIngresar to set
     */
    public void setBtnIngresar(CommandButton btnIngresar) {
        this.btnIngresar = btnIngresar;
    }

    /**
     * @return the btnLimpiar
     */
    public CommandButton getBtnLimpiar() {
        return btnLimpiar;
    }

    /**
     * @param btnLimpiar the btnLimpiar to set
     */
    public void setBtnLimpiar(CommandButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    public void ingresarJuego() {

        String usuario = txtIdAprendiz.getValue().toString();
        String codigo = txtIngresoCuestionario.getValue().toString();

        ProgramaAprendices logueado = proAprePersistencia.consultarAprendiz(usuario);
        Cuestionario ingreso = cuesPersistencia.consultarIngreso(codigo);
        String pagina = "";
        if ((logueado == null)&&(ingreso == null)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Notificación", "¡Usuario no registrado!"));
        } else {
            if (!ingreso.getCodigoIngresoCuestionario().equals(codigo)){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Notificación", "¡Clave incorrecta!"));
            } else {
                try {
                    pagina = "admin/indexPregunta.xhtml";
                    FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", logueado);
                    FacesContext.getCurrentInstance().getExternalContext().redirect(pagina);
                } catch (IOException ex) {
                    Logger.getLogger(VistaJugar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
