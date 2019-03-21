/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import clases.Pregunta;
import clases.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import persistencia.PreguntaFacade;
import persistencia.UsuarioFacade;

/**
 *
 * @author Equipo
 */
@Named(value = "vistaPregunta")
@RequestScoped
public class VistaPregunta {

    @EJB
    private PreguntaFacade preguntaPersistencia;
    @EJB
    private UsuarioFacade usuarioPersistencia;

    private List<Usuario> listaUsuario;
    private List<Pregunta> listaPregunta;

    private InputText txtPregunta;
    private InputText txtOpcionA_pregunta;
    private InputText txtOpcionB_pregunta;
    private InputText txtOpcionC_pregunta;
    private InputText txtOpcionD_pregunta;
    private InputText txtPuntaje_Pregunta;
    private SelectOneMenu cmbCodigo_usuario_pregunta;
    private InputText txtOpcionCorrecta_pregunta;
    private InputText txtUsuario_Pregunta;
    private CommandButton btnRegistrar;
    private CommandButton btnLimpiar;
    private CommandButton btnVolver;
    private ArrayList<SelectItem> itemsUsuarios;

    /**
     * Creates a new instance of VistaPregunta
     */
    public VistaPregunta() {
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
     * @return the usuarioPersistencia
     */
    public UsuarioFacade getUsuarioPersistencia() {
        return usuarioPersistencia;
    }

    /**
     * @param usuarioPersistencia the usuarioPersistencia to set
     */
    public void setUsuarioPersistencia(UsuarioFacade usuarioPersistencia) {
        this.usuarioPersistencia = usuarioPersistencia;
    }

    /**
     * @return the listaPregunta
     */
    public List<Pregunta> getListaPregunta() {
        return listaPregunta;
    }

    /**
     * @param listaPregunta the listaPregunta to set
     */
    public void setListaPregunta(List<Pregunta> listaPregunta) {
        this.listaPregunta = listaPregunta;
    }

    /**
     * @return the txtPregunta
     */
    public InputText getTxtPregunta() {
        return txtPregunta;
    }

    /**
     * @param txtPregunta the txtPregunta to set
     */
    public void setTxtPregunta(InputText txtPregunta) {
        this.txtPregunta = txtPregunta;
    }

    /**
     * @return the txtOpcionA_pregunta
     */
    public InputText getTxtOpcionA_pregunta() {
        return txtOpcionA_pregunta;
    }

    /**
     * @param txtOpcionA_pregunta the txtOpcionA_pregunta to set
     */
    public void setTxtOpcionA_pregunta(InputText txtOpcionA_pregunta) {
        this.txtOpcionA_pregunta = txtOpcionA_pregunta;
    }

    /**
     * @return the txtOpcionB_pregunta
     */
    public InputText getTxtOpcionB_pregunta() {
        return txtOpcionB_pregunta;
    }

    /**
     * @param txtOpcionB_pregunta the txtOpcionB_pregunta to set
     */
    public void setTxtOpcionB_pregunta(InputText txtOpcionB_pregunta) {
        this.txtOpcionB_pregunta = txtOpcionB_pregunta;
    }

    /**
     * @return the txtOpcionC_pregunta
     */
    public InputText getTxtOpcionC_pregunta() {
        return txtOpcionC_pregunta;
    }

    /**
     * @param txtOpcionC_pregunta the txtOpcionC_pregunta to set
     */
    public void setTxtOpcionC_pregunta(InputText txtOpcionC_pregunta) {
        this.txtOpcionC_pregunta = txtOpcionC_pregunta;
    }

    /**
     * @return the txtOpcionD_pregunta
     */
    public InputText getTxtOpcionD_pregunta() {
        return txtOpcionD_pregunta;
    }

    /**
     * @param txtOpcionD_pregunta the txtOpcionD_pregunta to set
     */
    public void setTxtOpcionD_pregunta(InputText txtOpcionD_pregunta) {
        this.txtOpcionD_pregunta = txtOpcionD_pregunta;
    }

    /**
     * @return the txtOpcionCorrecta_pregunta
     */
    public InputText getTxtOpcionCorrecta_pregunta() {
        return txtOpcionCorrecta_pregunta;
    }

    /**
     * @param txtOpcionCorrecta_pregunta the txtOpcionCorrecta_pregunta to set
     */
    public void setTxtOpcionCorrecta_pregunta(InputText txtOpcionCorrecta_pregunta) {
        this.txtOpcionCorrecta_pregunta = txtOpcionCorrecta_pregunta;
    }

    /**
     * @return the txtUsuario_Pregunta
     */
    public InputText getTxtUsuario_Pregunta() {
        return txtUsuario_Pregunta;
    }

    /**
     * @param txtUsuario_Pregunta the txtUsuario_Pregunta to set
     */
    public void setTxtUsuario_Pregunta(InputText txtUsuario_Pregunta) {
        this.txtUsuario_Pregunta = txtUsuario_Pregunta;
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

    /**
     * @return the txtPuntaje_Pregunta
     */
    public InputText getTxtPuntaje_Pregunta() {
        return txtPuntaje_Pregunta;
    }

    /**
     * @param txtPuntaje_Pregunta the txtPuntaje_Pregunta to set
     */
    public void setTxtPuntaje_Pregunta(InputText txtPuntaje_Pregunta) {
        this.txtPuntaje_Pregunta = txtPuntaje_Pregunta;
    }

    public void limpiar() {

        getTxtPregunta().setValue("");
        getTxtOpcionA_pregunta().setValue("");
        getTxtOpcionB_pregunta().setValue("");
        getTxtOpcionC_pregunta().setValue("");
        getTxtOpcionD_pregunta().setValue("");
        getTxtPuntaje_Pregunta().setValue("");
        getTxtOpcionCorrecta_pregunta().setValue("");
        getCmbCodigo_usuario_pregunta().setValue("");

    }
    
    public void volver() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("indexUsuario.xhtml");
    }

    public void registrarPregunta() {

        Pregunta nuevaPregunta = new Pregunta();

        nuevaPregunta.setPregunta(getTxtPregunta().getValue().toString());
        nuevaPregunta.setOpcionApregunta(getTxtOpcionA_pregunta().getValue().toString());

        nuevaPregunta.setOpcionBpregunta(getTxtOpcionB_pregunta().getValue().toString());
        nuevaPregunta.setOpcionCpregunta(getTxtOpcionC_pregunta().getValue().toString());
        nuevaPregunta.setOpcionDpregunta(getTxtOpcionD_pregunta().getValue().toString());
        nuevaPregunta.setOpcionCorrectapregunta(getTxtOpcionCorrecta_pregunta().getValue().toString());
        nuevaPregunta.setPuntajePregunta(Integer.parseInt(getTxtPuntaje_Pregunta().getValue().toString()));
        int codigo = Integer.parseInt(cmbCodigo_usuario_pregunta.getValue().toString());
        Usuario user = usuarioPersistencia.find(codigo);
       

        getPreguntaPersistencia().create(nuevaPregunta);

        limpiar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Notificación", "¡pregunta registrada correctamente!"));
    }

    /**
     * @return the listaUsuario
     */
    public List<Usuario> getListaUsuario() {
        listaUsuario = getUsuarioPersistencia().findAll();
        return listaUsuario;
    }

    /**
     * @param listaUsuario the listaUsuario to set
     */
    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    private Object preguntaPersistencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the cmbCodigo_usuario_pregunta
     */
    public SelectOneMenu getCmbCodigo_usuario_pregunta() {
        return cmbCodigo_usuario_pregunta;
    }

    /**
     * @param cmbCodigo_usuario_pregunta the cmbCodigo_usuario_pregunta to set
     */
    public void setCmbCodigo_usuario_pregunta(SelectOneMenu cmbCodigo_usuario_pregunta) {
        this.cmbCodigo_usuario_pregunta = cmbCodigo_usuario_pregunta;
    }

    /**
     * @return the itemsUsuarios
     */
    public ArrayList<SelectItem> getItemsUsuarios() {
        listaUsuario = usuarioPersistencia.findAll();
        itemsUsuarios = new ArrayList<>();
        for (Usuario u : listaUsuario) {
            itemsUsuarios.add(new SelectItem(u.getCodigoUsuario(), u.getNombreUsuario()));
        }
        return itemsUsuarios;
    }

    /**
     * @param itemsUsuarios the itemsUsuarios to set
     */
    public void setItemsUsuarios(ArrayList<SelectItem> itemsUsuarios) {
        this.itemsUsuarios = itemsUsuarios;
    }

    /**
     * @return the btnVolver
     */
    public CommandButton getBtnVolver() {
        return btnVolver;
    }

    /**
     * @param btnVolver the btnVolver to set
     */
    public void setBtnVolver(CommandButton btnVolver) {
        this.btnVolver = btnVolver;
    }

}
