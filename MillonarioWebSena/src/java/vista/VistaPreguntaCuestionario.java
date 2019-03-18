/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import clases.Pregunta;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.component.commandbutton.CommandButton;
import persistencia.PreguntaFacade;

/**
 *
 * @author Equipo
 */

@ManagedBean(name="vistaPreguntaCuestionario")
@ViewScoped
public class VistaPreguntaCuestionario {
    @EJB
    private PreguntaFacade preguntaPersistencia;
    
    
    private List<Pregunta> listaPreguntas;
    private List<Pregunta> NuevalistaPreguntas = new ArrayList<>();
    private List<Pregunta> preguntaSeleccionada;
    private CommandButton btnRegistrar;
    private CommandButton btnCrear;
    private CommandButton btnAnadir;
    /**
     * Creates a new instance of VistaPreguntaCuestionario
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
     * @return the listaPreguntas
     */
    public List<Pregunta> getListaPreguntas() {
        if(listaPreguntas==null){
            listaPreguntas=preguntaPersistencia.findAll();//trae todo lo de la base de datos
        }
        return listaPreguntas;
    }

    /**
     * @param listaPreguntas the listaPreguntas to set
     */
    public void setListaPreguntas(List<Pregunta> listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }

    /**
     * @return the NuevalistaPreguntas
     */
    public List<Pregunta> getNuevalistaPreguntas() {
        return NuevalistaPreguntas;
    }

    /**
     * @param NuevalistaPreguntas the NuevalistaPreguntas to set
     */
    public void setNuevalistaPreguntas(List<Pregunta> NuevalistaPreguntas) {
        this.NuevalistaPreguntas = NuevalistaPreguntas;
    }

    /**
     * @return the preguntaSeleccionada
     */
    public List<Pregunta> getPreguntaSeleccionada() {
        return preguntaSeleccionada;
    }

    /**
     * @param preguntaSeleccionada the preguntaSeleccionada to set
     */
    public void setPreguntaSeleccionada(List<Pregunta> preguntaSeleccionada) {
        this.preguntaSeleccionada = preguntaSeleccionada;
    }

    /**
     * @return the btnRegistrar
     */


    /**
     * @return the btnAnadir
     */
    public CommandButton getBtnAnadir() {
        
        return btnAnadir;
    }

    /**
     * @param btnAnadir the btnAnadir to set
     */
    public void setBtnAnadir(CommandButton btnAnadir) {
        this.btnAnadir = btnAnadir;
    }
    
    public void anadir(){
        System.out.println("Selecciono "+getPreguntaSeleccionada().size());
        NuevalistaPreguntas.addAll(getPreguntaSeleccionada());
        listaPreguntas.removeAll(getPreguntaSeleccionada());
        System.out.println("Nuevo tamaño "+listaPreguntas.size());
    }

    /**
     * @return the btnRegistrar
     */
    public CommandButton getBtnRegistrar() {
        return btnRegistrar;
    }

    /**
     * @param btnRegistrar the btnRegistrar to set
     */
    public void setBtnRegistrar(CommandButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    /**
     * @return the btnCrear
     */
    public CommandButton getBtnCrear() {
        return btnCrear;
    }

    /**
     * @param btnCrear the btnCrear to set
     */
    public void setBtnCrear(CommandButton btnCrear) {
        this.btnCrear = btnCrear;
    }
    
}
